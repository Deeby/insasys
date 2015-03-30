<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>리스트페이지</title>
</head>
<body>
</body>
 <table>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>	
		</tr>
		<c:if test="${empty list }">
		 게시물이 비었습니다.
		</c:if>
		<c:if test="${!empty list }">
	<c:forEach var="dto" items="${list }">
        <tr>
           <td>${dto.num }</td>
           <td><a href="./read.insa?num=${dto.num }">${dto.title }</a></td>
           <td>${dto.empid }</td>
           <td>${dto.regdate }</td>
        </tr>
     </c:forEach>
     </c:if>
</table>
   
 
</body>
</html>