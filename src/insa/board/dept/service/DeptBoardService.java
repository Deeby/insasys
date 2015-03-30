package insa.board.dept.service;

import java.util.List;

import insa.board.dept.dto.DeptBoardDto;
import insa.board.imgboard.dto.ImgBoardDTO;
import insa.board.notice.mapper.NoticeMapper;

import javax.inject.Inject;

import org.springframework.stereotype.Service;



public interface DeptBoardService {
	
	  void deptInsert(DeptBoardDto dto);
	  List<DeptBoardDto>list();
	  void deptUpdate(DeptBoardDto dto);
	  void deptDelete(int num);
	  DeptBoardDto deptView(int num);

}
