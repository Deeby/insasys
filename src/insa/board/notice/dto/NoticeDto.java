package insa.board.notice.dto;

import java.sql.Date;

public class NoticeDto {   //�������� dto
 
	private int num;               //�� ��ȣ
	private String title;           //�� ����
	private String content;     //�� ����
	private String fileName;    //�����̸�
	private Date regdate;          //�ۼ���¥
	private int empid;            //���ۼ��� 
	

	public NoticeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public NoticeDto(int num, String title, String content, String fileName,
			Date regdate, int empid) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.fileName = fileName;
		this.regdate = regdate;
		this.empid = empid;
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

	@Override
	public String toString() {
		return "NoticeDto [num=" + num + ", title=" + title + ", content="
				+ content + ", fileName=" + fileName + ", regdate=" + regdate
				+ ", empid=" + empid + "]";
	}
	
	
	

	
	
}