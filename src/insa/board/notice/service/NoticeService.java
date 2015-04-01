package insa.board.notice.service;

import insa.board.notice.dto.NoticeDto;

import java.util.List;

public interface NoticeService {

	
	 List<NoticeDto>list();

	 String sysdate();

	NoticeDto read(int num);

	void write(NoticeDto dto);

	void modify(NoticeDto dto);

	void delete(int num);
}
