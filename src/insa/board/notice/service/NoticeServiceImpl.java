package insa.board.notice.service;

import insa.board.notice.dao.NoticeDao;
import insa.board.notice.dto.NoticeDto;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Inject
	NoticeDao dao;

	@Override
	public List<NoticeDto>list(){
		 
		return null;
	 }
	
	
	@Override
	public String sysdate(){
		
		return dao.sysdate();
		
	}
}
