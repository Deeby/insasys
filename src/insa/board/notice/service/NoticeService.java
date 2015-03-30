package insa.board.notice.service;

import insa.board.notice.dto.NoticeDto;

import java.util.List;

public interface NoticeService {

	
	 List<NoticeDto>list();

	 String sysdate();
}
