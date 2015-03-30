package insa.board.dept.mapper;

import insa.board.dept.dto.DeptBoardDto;

import java.util.List;

public interface DeptBoardMapper {
	//�Խñ۸��
	public List<DeptBoardDto> list();
	
	//���ۼ�
	public void create(DeptBoardDto dto);
	
	//�ۼ���
	public void update(DeptBoardDto dto);
	
	//�ۻ���
	public void delete(int num);
	
	//�󼼺���
	public DeptBoardDto view(int num);
}
