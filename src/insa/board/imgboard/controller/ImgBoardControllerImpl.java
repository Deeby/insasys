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

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

public class ImgBoardControllerImpl implements ImgBoardController {
	
	private String uploadPath = "C:\\Users\\Administrator\\git\\insa\\insa\\WebContent\\WEB-INF\\files\\";
	@Inject
	ImgBoardService service;
	
	@RequestMapping(value="/write.insa" , method=RequestMethod.GET)
	public ModelAndView createPage(HttpServletRequest request){
		ModelAndView model = new ModelAndView();
		model.setViewName("viewPage");
		return model;
	}
	
	@RequestMapping(value="/write.insa" , method=RequestMethod.POST)
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
    @RequestMapping(value="/update.insa", method=RequestMethod.GET)
	public ModelAndView updatePage(HttpServletRequest request, ImgBoardDTO dto) {
        ModelAndView model = new ModelAndView();
        model.setViewName("update");
        return model;
	}
    //수정
    @RequestMapping(value="/update.insa", method=RequestMethod.POST)
	public String update(HttpServletRequest request, ImgBoardDTO dto) {
		service.update(dto);
	    
		return "redirect:/list.insa"; 
	}
    //삭제
    @RequestMapping(value="delete" , method=RequestMethod.POST)
	public ModelAndView delete(HttpServletRequest request) {
		int num = Integer.parseInt(request.getParameter("num"));
        service.delete(num);
        ModelAndView model = new ModelAndView();
        model.setViewName("deleteResult");
		return model;
	}
	

	@Override
	//게시판리스트
	@RequestMapping(value="list.insa" , method=RequestMethod.POST)
	public ModelAndView list(HttpServletRequest request) {
          
		ModelAndView model = new ModelAndView();
		List<ImgBoardDTO> list = service.list();
		model.addObject("list", list);
		model.setViewName("list");
		return model;
	}

	@Override
	//상세내용페이지
	@RequestMapping(value="/read.insa" , method=RequestMethod.POST)
	public ModelAndView read(HttpServletRequest request, ImgBoardDTO dto) {
        int num = Integer.parseInt(request.getParameter("num"));
        dto = service.view(num);
        ModelAndView model = new ModelAndView();
        model.addObject("dto", dto);
        model.setViewName("read");
        return null;
	}

	

}
