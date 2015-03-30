package insa.board.imgboard.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import insa.board.imgboard.dto.ImgBoardDTO;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

public interface ImgBoardController {
   String create(@ModelAttribute("ImgBoardDTO")ImgBoardDTO dto ,MultipartHttpServletRequest request);
   String update(@ModelAttribute("ImgBoardDTO") ImgBoardDTO dto,HttpServletRequest request);
   ModelAndView delete(HttpServletRequest request);
   ModelAndView list(HttpServletRequest request);
   ModelAndView read(HttpServletRequest request,ImgBoardDTO dto);
   
     
}
