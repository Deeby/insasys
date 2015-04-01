package insa.board.notice.controller;

import insa.board.notice.dto.NoticeDto;
import insa.board.notice.service.NoticeService;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class NoticeController {
 
    @Inject
    NoticeService service;
	
    //리스트
	@RequestMapping(value="/noticeList.insa", method = RequestMethod.GET)
	public ModelAndView noticeList(){
		ModelAndView model = new ModelAndView();
		List<NoticeDto> noticeList = service.list();
		model.addObject("noticeList", noticeList);
		model.setViewName("noticeList");
		return model;
	} 
	//상세보기
	@RequestMapping(value="/noticeRead.insa", method = RequestMethod.GET)
	public ModelAndView noticeRead(HttpServletRequest request){
		ModelAndView model = new ModelAndView();
		String num = request.getParameter("num");
		int nums = Integer.parseInt(num);
		NoticeDto noticeRead = service.read(nums);
		System.out.println(noticeRead.toString());
		model.addObject("noticeRead", noticeRead);
		model.setViewName("noticeRead");
		return model;
	} 
	
	//글쓰기화면이동
	@RequestMapping(value="/noticeWrite.insa", method = RequestMethod.GET)
	public ModelAndView noticeWrite(HttpServletRequest request){
		
		ModelAndView model = new ModelAndView();
		model.setViewName("noticeWrite");
		return model;
	} 
	
	//글쓰기저장
	@RequestMapping(value="/noticeWrite.insa", method = RequestMethod.POST)
	public String noticeWriteSave( NoticeDto dto){
		
		service.write(dto);
		
		return "redirect:/noticeList.insa";
	}
	//글수정화면이동
	@RequestMapping(value="/noticeModify.insa", method = RequestMethod.GET)
	public ModelAndView noticeModify(HttpServletRequest request){
		
		ModelAndView model = new ModelAndView();
		String num = request.getParameter("num");
		int nums = Integer.parseInt(num);
		NoticeDto noticeModify = service.read(nums);
		model.addObject("noticeModify", noticeModify);
		model.setViewName("noticeModify");
		
		return model;
}
	//수정저장
	@RequestMapping(value="/noticeModify.insa", method = RequestMethod.POST)
	public String noticeModifySave(NoticeDto dto){
		
		service.modify(dto);
		return "redirect:/noticeList.insa";
}
	//글 삭제
	@RequestMapping(value="/noticeDelete.insa", method = RequestMethod.GET)
	public String noticeModifySave(int num){
		
		service.delete(num);
		return "redirect:/noticeList.insa";
}
}