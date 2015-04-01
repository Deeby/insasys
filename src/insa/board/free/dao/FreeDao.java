package insa.board.free.dao;

import insa.board.free.dto.FreeDto;
import insa.board.free.mapper.FreeMapper;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;
@Component
public class FreeDao {

	@Inject
	FreeMapper mapper;
	
	public List<FreeDto> list() {
		return mapper.list();
	}

	public FreeDto read(int num) {
		return mapper.read(num);
	}

	public void write(FreeDto dto) {
		mapper.write(dto);
	}

	public void modify(FreeDto dto) {
		mapper.modify(dto);
	}

	public void delete(int num) {
		mapper.delete(num);
	}

	public FreeDto downread(int num) {
		return mapper.downread(num);
	}

}
