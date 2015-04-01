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
		 
		return dao.list();
	 }
	
	
	@Override
	public String sysdate(){
		
		return dao.sysdate();
		
	}


	@Override
	public NoticeDto read(int num) {
		return dao.read(num);
	}


	@Override
	public void write(NoticeDto dto) {
		dao.write(dto);
	}


	@Override
	public void modify(NoticeDto dto) {
		dao.modify(dto);
	}


	@Override
	public void delete(int num) {
		dao.delete(num);
	}
}
