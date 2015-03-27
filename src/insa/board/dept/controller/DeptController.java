package insa.board.dept.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeptController {

		
		@RequestMapping(value="/deptgesi.insa", method = RequestMethod.GET)
		public ModelAndView goIndex(){
			ModelAndView model = new ModelAndView();
			model.setViewName("deptmainpage");
			return model;
		} 
	
}
