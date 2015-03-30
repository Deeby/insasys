package insa.board.imgboard.dao;

import insa.board.imgboard.dto.ImgBoardDTO;
import insa.board.imgboard.mapper.ImgboardMapper;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;
@Component
public class ImgBoardDaoImpl implements ImgBoardDao {
 @Inject
 ImgboardMapper mapper;
 
 
	@Override
	public void create(ImgBoardDTO dto) {
	mapper.create(dto);
		
	}

	@Override
	public List<ImgBoardDTO> list() {
		
		List<ImgBoardDTO>list = mapper.list();
		return list;
	}

	@Override
	public void update(ImgBoardDTO dto) {
		mapper.update(dto);
	}

	@Override
	public void delete(int num) {
		mapper.delete(num);
		
	}

	@Override
	public ImgBoardDTO view(int num) {
		ImgBoardDTO board = new ImgBoardDTO();
		System.out.println("dao - num :"+num);
		board = mapper.view(num);
		return board;
	}



}
