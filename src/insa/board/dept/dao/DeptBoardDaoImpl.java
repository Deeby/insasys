package insa.board.dept.dao;

import insa.board.dept.dto.DeptBoardDto;
import insa.board.dept.mapper.DeptBoardMapper;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class DeptBoardDaoImpl implements DeptBoardDao {

	 @Inject
	 DeptBoardMapper mapper;
 
 	
	@Override
	public List<DeptBoardDto> list() {
		
		List<DeptBoardDto>list = mapper.list();
		return list;
	}
	
	@Override
	public void deptInsert(DeptBoardDto dto) {
	mapper.create(dto);
		
	}

	@Override
	public void deptUpdate(DeptBoardDto dto) {
		mapper.update(dto);
	}

	@Override
	public void deptDelete(int num) {
		mapper.delete(num);
		
	}

	@Override
	public DeptBoardDto deptView(int num) {
		DeptBoardDto board = new DeptBoardDto();
		board = mapper.view(num);
		return board;
	}



}
