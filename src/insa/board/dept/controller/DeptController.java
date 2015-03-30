package insa.board.dept.controller;

import insa.board.dept.dto.DeptBoardDto;
import insa.board.dept.service.DeptBoardService;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeptController implements DeptControllerImpl{

	@Inject
	DeptBoardService deptservice;
		
	//����������
	@RequestMapping(value="/deptgesi.insa", method = RequestMethod.GET)
	public ModelAndView list(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();		
		System.out.println("��Ʈ�ѷ� ����....");
		mav.setViewName("deptmainpage");
		return mav;
	}
	
	@RequestMapping(value="/deptgesi.insa", method = RequestMethod.POST)
	public ModelAndView list2(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();		
		System.out.println("��Ʈ�ѷ� ����!!!....");
		mav.setViewName("deptmainpage");
		return mav;
	}


	@RequestMapping(value="/dept_insert.insa", method = RequestMethod.GET)
	public ModelAndView deptInsert(HttpServletRequest request, DeptBoardDto dto) {
		ModelAndView mav = new ModelAndView();		
		System.out.println("Insert ��Ʈ�ѷ� ����....");
		mav.setViewName("dept_insert");
		return mav;
	}

	@Override
	public ModelAndView deptUpdate(HttpServletRequest request, DeptBoardDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView deptDelete(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public ModelAndView deptView(HttpServletRequest request, DeptBoardDto dto) {
		// TODO Auto-generated method stub
		return null;
	} 

}
