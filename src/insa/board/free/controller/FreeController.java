package insa.board.free.controller;

import insa.board.free.dto.FreeDto;
import insa.board.free.service.FreeService;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.UUID;

import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FreeController {

	@Inject
	FreeService service;

	// ����Ʈ
	@RequestMapping(value = "/freeList.insa", method = RequestMethod.GET)
	public ModelAndView noticeList() {
		ModelAndView model = new ModelAndView();
		List<FreeDto> freeList = service.list();
		model.addObject("freeList", freeList);
		model.setViewName("freeList");
		return model;
		
	}

	// �󼼺���
	@RequestMapping(value = "/freeRead.insa", method = RequestMethod.GET)
	public ModelAndView freeRead(HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		String num = request.getParameter("num");
		int nums = Integer.parseInt(num);
		FreeDto freeRead = service.read(nums);
		model.addObject("freeRead", freeRead);
		model.setViewName("freeRead");
		
		return model;
	}

	// �۾���ȭ���̵�
	@RequestMapping(value = "/freeWrite.insa", method = RequestMethod.GET)
	public ModelAndView noticeWrite(HttpServletRequest request) {

		ModelAndView model = new ModelAndView();
		model.setViewName("freeWrite");
		return model;
	}

	// �۾�������
	@RequestMapping(value = "/freeWrite.insa", method = RequestMethod.POST)
	public ModelAndView noticeWriteSave(MultipartHttpServletRequest request, FreeDto dto) {
		
		ModelAndView model = new ModelAndView();
		MultipartFile uploadFile = request.getFile("uploadFile");  // jsp���� ���� ������ �ö��
		
		
		if (uploadFile != null) {
			String filename = uploadFile.getOriginalFilename();  // �����̸� �̾ƿ�
			String uuid = UUID.randomUUID().toString().replace("-", "");  // uuid�� ��������������
			String uufile = uuid+"_"+filename;            // uuid�� ���ϳ��� ������
			
			String thumb = uufile.replace(".", "");
			dto.setThumb(thumb);
			dto.setFileName(uufile);     // uuid�� ���ϳ��� ����
			service.write(dto);
			List<FreeDto> list = service.list();
			model.addObject("freeList", list);
			model.setViewName("freeList");
			System.out.println(request.getContextPath());
			
			try {
				File file = new File("/upload/" + uufile); //������ �����Ұ������
				System.out.println(file.getAbsolutePath()+"dfdf");
				uploadFile.transferTo(file);  //��ο� ����
				thumbnails(uufile,thumb);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (uploadFile == null || uploadFile.equals("")|| uploadFile.getSize()<=0) {  //���ε����Ͼ����� �׳� �۾�������

			service.write(dto);
			System.out.println(dto);
		}
		return model;
	}

	// �ۼ���ȭ���̵�
	@RequestMapping(value = "/freeModify.insa", method = RequestMethod.GET)
	public ModelAndView noticeModify(HttpServletRequest request) {

		ModelAndView model = new ModelAndView();
		String num = request.getParameter("num");
		int nums = Integer.parseInt(num);
		FreeDto freeModify = service.read(nums);
		model.addObject("freeModify", freeModify);
		model.setViewName("freeModify");

		return model;
	}

	// ��������
	@RequestMapping(value = "/freeModify.insa", method = RequestMethod.POST)
	public String freeModifySave(FreeDto dto) {

		service.modify(dto);
		return "redirect:/freeList.insa";
	}

	// �� ����
	@RequestMapping(value = "/freeDelete.insa", method = RequestMethod.GET)
	public String freeModifySave(int num) {

		service.delete(num);
		return "redirect:/freeList.insa";
	}
	//�ٿ�ε�
	@RequestMapping(value="/freeDown.insa", method = RequestMethod.GET)
	public void freeDown(HttpServletResponse response, int num) throws Exception{
		
		String fileName = service.downread(num).getFileName();  // ȭ�鿡 �������� �����̸��̾ƴ� DB�� ����� �����̸� �ҷ���

		response.setContentType("application/octet-stream");
		
		fileName = new String(fileName.getBytes("UTF-8"), "iso-8859-1");
		
		OutputStream os = response.getOutputStream();

		String path = "/WebContent/upload/";

		FileInputStream fis = new FileInputStream(path + File.separator + fileName);
        response.setHeader("Content-Disposition", "attachment;fileName=" +service.read(num).getFileName());

        int n = 0;
        byte[] b = new byte[512];
        while((n = fis.read(b)) != -1 ) {
            os.write(b, 0, n);
        }
        fis.close();
        os.close();
	}
	
	
	public void thumbnails(String uufile, String thumb){
		try {
			File originalFileNm = new File("./upload/"+ uufile);
			File thumbnailFileNm = new File("./upload/"+thumb+".jpg");
			System.out.println(thumbnailFileNm);
			int width = 50;
			int height = 50;
			// ����� �̹��� ����
			BufferedImage originalImg = ImageIO.read(originalFileNm);
			BufferedImage thumbnailImg = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
			// ����� �׸��� 
			Graphics2D g = thumbnailImg.createGraphics();
			g.drawImage(originalImg, 0, 0, width, height, null);
			// ���ϻ���
			ImageIO.write(thumbnailImg, "jpg", thumbnailFileNm);	
			
			System.out.println("Dfdfdfdf");
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	
}
