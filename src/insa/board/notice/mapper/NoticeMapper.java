package insa.board.notice.mapper;

import insa.board.notice.dto.NoticeDto;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;



public interface NoticeMapper {
  
	@Select(" select sysdate from dual")
	public String getTime();


	public List<NoticeDto> list();

	@Select("select * from notice where num = #{num} ")
	public NoticeDto read(int num);

	public void write(NoticeDto dto);

	@Update("update notice set title=#{title}, content=#{content} where num=#{num}")
	public void modify(NoticeDto dto);

	@Delete("delete from notice where num=#{num}")
	public void delete(int num);
	
}
