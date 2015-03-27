package insa.board.imgboard.dto;

import java.sql.Date;

public class ImgBoardDTO {
 private int num;
 private String title;
 private String content;
 private String filename;
 Date regdate;
 private int empid;
 
 
 
 
 
public ImgBoardDTO() {
	super();
	// TODO Auto-generated constructor stub
}
public ImgBoardDTO(int num, String title, String content, String filename,
		Date regdate, int empid) {
	super();
	this.num = num;
	this.title = title;
	this.content = content;
	this.filename = filename;
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
public String getFilename() {
	return filename;
}
public void setFilename(String filename) {
	this.filename = filename;
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
 
 
}
