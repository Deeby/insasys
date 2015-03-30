package insa.board.notice.mapper;

import insa.board.notice.dto.NoticeDto;

import java.util.List;

import org.apache.ibatis.annotations.Select;


public interface NoticeMapper {
  
	@Select(" select sysdate from dual")
	public String getTime();

	 	
	public List<NoticeDto> list(NoticeDto dto);
	
}
