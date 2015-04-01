package insa.board.notice.dao;

import insa.board.notice.dto.NoticeDto;
import insa.board.notice.mapper.NoticeMapper;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;
@Component
public class NoticeDaoImpl implements NoticeDao {

	@Inject
	NoticeMapper mapper;
	
	@Override
	public String sysdate(){
		
		return mapper.getTime();
	}
	
	//
	public List<NoticeDto> list(){
		
		return mapper.list();
	}

	@Override
	public NoticeDto read(int num) {
		return mapper.read(num);
	}

	@Override
	public void write(NoticeDto dto) {
		mapper.write(dto);
	}

	@Override
	public void modify(NoticeDto dto) {
		mapper.modify(dto);
	}

	@Override
	public void delete(int num) {
		mapper.delete(num);
	}

}
