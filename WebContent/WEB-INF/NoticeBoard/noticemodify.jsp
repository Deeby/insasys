<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="./noticeModify.insa" method="post">
<table border="1" align="center" width="100%">
		<tr height="10px" align="center">
			<td>번호</td>
			<td>제목</td>
			<td>내용</td>
			<td>작성자</td>

		</tr>

			<tr align="center" height="15px">
				<td><input type="text" value="${noticeModify.getNum()}" name="num" readonly></td>
				<!-- 게시물 번호 -->
				<td><input type="text" value="${noticeModify.getTitle()}" name="title"></td>
				<!--  게시물 제목 -->
				<td><input type="text" value="${noticeModify.getContent()}" name="content"></td>
				<!--  게시물 내용-->
				<td><input type="text" value="${noticeModify.getEmpid()}" name="empid" readonly></td>
			</tr>
	</table>
	<input type="submit" value="등록">
</form>

</body>
</html>