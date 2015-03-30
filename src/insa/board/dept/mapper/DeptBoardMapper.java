package insa.board.dept.mapper;

import insa.board.dept.dto.DeptBoardDto;

import java.util.List;

public interface DeptBoardMapper {
	//게시글목록
	public List<DeptBoardDto> list();
	
	//글작성
	public void create(DeptBoardDto dto);
	
	//글수정
	public void update(DeptBoardDto dto);
	
	//글삭제
	public void delete(int num);
	
	//상세보기
	public DeptBoardDto view(int num);
}
