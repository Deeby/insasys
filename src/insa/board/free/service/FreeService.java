package insa.board.free.service;

import insa.board.free.dao.FreeDao;
import insa.board.free.dto.FreeDto;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class FreeService {

	@Inject
	FreeDao dao;
	
	public List<FreeDto> list() {
		return dao.list();
	}

	public FreeDto read(int nums) {
		return dao.read(nums);
	}

	public void write(FreeDto dto) {
		dao.write(dto);
	}

	public void modify(FreeDto dto) {
		dao.modify(dto);
	}

	public void delete(int num) {
		dao.delete(num);
	}

	public FreeDto downread(int num) {
		
		return dao.downread(num);
		
	}

}
