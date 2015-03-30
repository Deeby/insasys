package insa.board.dept.controller;

import javax.servlet.http.HttpServletRequest;
import insa.board.dept.dto.DeptBoardDto;
import org.springframework.web.servlet.ModelAndView;

public interface DeptControllerImpl {
   ModelAndView deptInsert(HttpServletRequest request, DeptBoardDto dto);
   ModelAndView deptUpdate(HttpServletRequest request, DeptBoardDto dto);
   ModelAndView deptDelete(HttpServletRequest request);
   ModelAndView list(HttpServletRequest request);
   ModelAndView deptView(HttpServletRequest request,DeptBoardDto dto);
   
     
}
