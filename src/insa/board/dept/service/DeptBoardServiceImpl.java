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
	
	//�Խ��� ���
	@Override
	public List<DeptBoardDto> list() {
		List<DeptBoardDto> list = detpdao.list();
		return list;
	}
    
    //�Խ��� �۾���
	@Override
	public void deptInsert(DeptBoardDto dto) {
       	detpdao.deptInsert(dto);	
       	
	}
	

	
	// �� ����
	@Override
	public void deptUpdate(DeptBoardDto dto) {
        detpdao.deptUpdate(dto);		
	}
	// �� ����
	@Override
	public void deptDelete(int num) {
		detpdao.deptDelete(num);
		
	}
	
	// �� �󼼺���
	@Override
	public DeptBoardDto deptView(int num) {
		DeptBoardDto board = new DeptBoardDto();
		board = detpdao.deptView(num);
		return board;
	}

}