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
	<h1>free List</h1>


	<table border="1" align="center" height ="450px" width="100%">
		<tr height="20px" align="center">
			<td>�̸�����</td>
			<td>��ȣ</td>
			<td>����</td>
			<td>�ð�</td>
			<td>�ۼ���</td>

		</tr>

		<!-- glist�� ���� ��ŭ for�� ���� -->
		<c:forEach items="${freeList }" var="freeList">
			<tr align="center" height="15px">
				<td><img src="upload/${freeList.thumb }.jpg"></td>
				<td>${freeList.num}</td>
				<!-- �Խù� ��ȣ -->
				<td><a href="./freeRead.insa?num=${freeList.num }">${freeList.title }</a></td>
				<!--  �Խù� �ۼ����� -->
				<td>${freeList.regdate }</td>
				<!--  �Խù� �ۼ���ID -->
				<td>${freeList.empid }</td>
			</tr>
		</c:forEach>
		<a href="./freeWrite.insa"><input type="button" value="�۾���"/></a>
	</table>
	

</body>
</html>