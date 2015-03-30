package insa.board.notice.dao;

import insa.board.notice.mapper.NoticeMapper;

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
}
