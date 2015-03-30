package insa.board.dept.dao;

import java.util.List;

import insa.board.dept.dto.DeptBoardDto;


public interface DeptBoardDao {
	  void deptInsert(DeptBoardDto dto);
	  List<DeptBoardDto>list();
	  void deptUpdate(DeptBoardDto dto);
	  void deptDelete(int num);
	  DeptBoardDto deptView(int num);
  
}
