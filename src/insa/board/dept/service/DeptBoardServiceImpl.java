package insa.board.dept.service;

import insa.board.dept.dao.DeptBoardDao;
import insa.board.dept.dto.DeptBoardDto;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;


@Service
public class DeptBoardServiceImpl implements DeptBoardService {
    
    @Inject
    DeptBoardDao detpdao;    
	
	//게시판 목록
	@Override
	public List<DeptBoardDto> list() {
		List<DeptBoardDto> list = detpdao.list();
		return list;
	}
    
    //게시판 글쓰기
	@Override
	public void deptInsert(DeptBoardDto dto) {
       	detpdao.deptInsert(dto);	
       	
	}
	

	
	// 글 수정
	@Override
	public void deptUpdate(DeptBoardDto dto) {
        detpdao.deptUpdate(dto);		
	}
	// 글 삭제
	@Override
	public void deptDelete(int num) {
		detpdao.deptDelete(num);
		
	}
	
	// 글 상세보기
	@Override
	public DeptBoardDto deptView(int num) {
		DeptBoardDto board = new DeptBoardDto();
		board = detpdao.deptView(num);
		return board;
	}

}