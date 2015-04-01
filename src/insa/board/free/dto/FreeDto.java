package insa.board.free.dto;

import java.sql.Date;

public class FreeDto {

	private int num;               //글 번호
	private String title;           //글 제목
	private String content;     //글 내용
	private String fileName;    //파일이름
	private Date regdate;          //작성날짜
	private int empid;            //글작성자 
	private String thumb;
	
	public FreeDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	public FreeDto(int num, String title, String content, String fileName,
			Date regdate, int empid, String thumb) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.fileName = fileName;
		this.regdate = regdate;
		this.empid = empid;
		this.thumb = thumb;
	}




	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getThumb() {
		return thumb;
	}




	public void setThumb(String thumb) {
		this.thumb = thumb;
	}




	@Override
	public String toString() {
		return "FreeDto [num=" + num + ", title=" + title + ", content="
				+ content + ", fileName=" + fileName + ", regdate=" + regdate
				+ ", empid=" + empid + "]";
	}
	
	
	
	
}

