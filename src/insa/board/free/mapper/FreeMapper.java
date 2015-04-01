package insa.board.free.mapper;

import insa.board.free.dto.FreeDto;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface FreeMapper {

	
	@Select("select * from free order by num desc")
	public List<FreeDto> list();
	
	@Select("select num,title,content,substr(filename, instr(filename,'_')+1) filename ,regdate,empid from free where num = #{num}  ")
	public FreeDto read(int num); 

	public void write(FreeDto dto);
	
	@Update("update free set title=#{title}, content=#{content} where num=#{num}")
	public void modify(FreeDto dto);
	
	@Delete("delete from free where num=#{num}")
	public void delete(int num);

	@Select("select * from free where num = #{num}")
	public FreeDto downread(int num); 
}
