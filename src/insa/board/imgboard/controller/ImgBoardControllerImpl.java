package insa.board.imgboard.controller;

import insa.board.imgboard.dto.ImgBoardDTO;
import insa.board.imgboard.service.ImgBoardService;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ImgBoardControllerImpl implements ImgBoardController {
	
	private String uploadPath = "C:\\Users\\Administrator\\git\\insa\\insa\\WebContent\\WEB-INF\\files\\";
	@Inject
	ImgBoardService service;
	
	@RequestMapping(value="/imgBoard/write.insa" , method=RequestMethod.GET)
	public ModelAndView createPage(HttpServletRequest request){
		ModelAndView model = new ModelAndView();
		model.setViewName("imgboardviewPage");
		return model;
	}
	

    
	@RequestMapping(value="/imgBoard/write.insa" , method=RequestMethod.POST)
	public String create(@ModelAttribute("ImgBoardDTO")ImgBoardDTO dto ,MultipartHttpServletRequest request) {
        
		// get upload file
		MultipartFile file = request.getFile("file");
		String fileName = file.getOriginalFilename();
		File uploadFile = new File(uploadPath + fileName);
		// when file exists as same name
		if(uploadFile.exists()){
			fileName = new Date().getTime() + fileName;
			uploadFile = new File(uploadPath + fileName);
		}
		// save upload file to uploadPath
		try {
			file.transferTo(uploadFile);
		} catch (Exception e) {
			
		}
		dto.setFilename(fileName);
		//
		// new line code change to <br /> tag	
		String content =  dto.getContent().replaceAll("\r\n", "<br />");
		dto.setContent(content);
		//
		service.create(dto);		
		 try {
	            //썸네일 가로사이즈
	            int thumbnail_width = 100;
	            //썸네일 세로사이즈
	            int thumbnail_height = 100;
	            //원본이미지파일의 경로+파일명 	
	            File origin_file_name = new File("D:"+File.separator+"original_image.jpg");
	            //생성할 썸네일파일의 경로+썸네일파일명
	            File thumb_file_name = new File("D:"+File.separator+"thumbnail_image.jpg");
	 
	            BufferedImage buffer_original_image = ImageIO.read(origin_file_name);
	            BufferedImage buffer_thumbnail_image = new BufferedImage(thumbnail_width, thumbnail_height, BufferedImage.TYPE_3BYTE_BGR);
	            Graphics2D graphic = buffer_thumbnail_image.createGraphics();
	            graphic.drawImage(buffer_original_image, 0, 0, thumbnail_width, thumbnail_height, null);
	            ImageIO.write(buffer_thumbnail_image, "jpg", thumb_file_name);
	            System.out.println("썸네일 생성완료");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		return "redirect:list.insa";
         		
	}
	//수정페이지 이동
    @RequestMapping(value="/imgBoard/update.insa", method=RequestMethod.GET)
	public ModelAndView updatePage(HttpServletRequest request, ImgBoardDTO dto) {
    	System.out.println("update도착");
    	int num = Integer.parseInt(request.getParameter("num"));
    	System.out.println("수정할 글번호 :"+num);
    	dto = service.view(num);
        ModelAndView model = new ModelAndView();
        model.addObject("dto", dto);
        model.setViewName("imgboardupdate");
        return model;
	}
    //수정
    @RequestMapping(value="/imgBoard/update.insa", method=RequestMethod.POST)
	public String update(@ModelAttribute("ImgBoardDTO") ImgBoardDTO dto,HttpServletRequest request ) {
    	System.out.println("update도착");
    	
		service.update(dto);
	    
		return "redirect:./list.insa"; 
	}
    //삭제
    @RequestMapping(value="/imgBoard/delete.insa" , method=RequestMethod.GET)
	public ModelAndView delete(HttpServletRequest request) {
    	System.out.println("delete도착");
		int num = Integer.parseInt(request.getParameter("num"));
        service.delete(num);
        ModelAndView model = new ModelAndView();
        model.setViewName("imgboarddeleteResult");
		return model;
	}
	

	@Override
	//게시판리스트
	@RequestMapping(value="/imgBoard/list.insa" , method=RequestMethod.GET)
	public ModelAndView list(HttpServletRequest request) {
        System.out.println("list도착");
        
		ModelAndView model = new ModelAndView();
		List<ImgBoardDTO> list = service.list();
		model.addObject("list", list);
		model.setViewName("imgboardlist");
		return model;
	}

	@Override
	//상세내용페이지
	@RequestMapping(value="/imgBoard/read.insa" , method=RequestMethod.GET)
	public ModelAndView read(HttpServletRequest request, ImgBoardDTO dto) {
		System.out.println("read도착");
        int num = Integer.parseInt(request.getParameter("num"));
        System.out.println("num ="+num);
        dto = service.view(num);
        ModelAndView model = new ModelAndView();
        model.addObject("dto", dto);
        model.setViewName("imgboardread");
        return model;
	}

	

}
