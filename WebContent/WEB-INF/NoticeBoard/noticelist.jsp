<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Notice List</h1>


	<table border="1" align="center" height ="450px" width="100%">
		<tr height="20px" align="center">
			<td>번호</td>
			<td>제목</td>
			<td>시간</td>
			<td>작성자</td>

		</tr>

		<!-- glist의 길이 많큼 for문 실행 -->
		<c:forEach items="${noticeList }" var="noticeList">
			<tr align="center" height="15px">
				<td>${noticeList.num}</td>
				<!-- 게시물 번호 -->
				<td><a href="./noticeRead.insa?num=${noticeList.num }">${noticeList.title }</a></td>
				<!--  게시물 작성일자 -->
				<td>${noticeList.regdate }</td>
				<!--  게시물 작성자ID -->
				<td>${noticeList.empid }</td>
			</tr>
		</c:forEach>
		<a href="./noticeWrite.insa"><input type="button" value="글쓰기"/></a>
	</table>
	

</body>
</html>