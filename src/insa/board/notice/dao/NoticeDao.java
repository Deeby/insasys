package insa.board.notice.dao;

import insa.board.notice.dto.NoticeDto;

import java.util.List;

public interface NoticeDao {

	String sysdate();
	List<NoticeDto> list();
	NoticeDto read(int num);
	void write(NoticeDto dto);
	void modify(NoticeDto dto);
	void delete(int num);
	
}
