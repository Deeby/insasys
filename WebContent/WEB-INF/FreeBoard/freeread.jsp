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

<form action="./freeModify.insa" method="get">
	 <input type="hidden" value="${freeRead.getNum() }" name="num">
	<table border="1" align="center" width="100%">
		<tr height="10px" align="center">
			<td>��ȣ</td>
			<td>����</td>
			<td>����</td>
			<td>�ۼ���</td>

		</tr>
		<tr>
		���� : <a href="./freeDown.insa?num=${freeRead.num }">${freeRead.fileName }</a>
		</tr>
		<!-- glist�� ���� ��ŭ for�� ���� -->
		
			<tr align="center" height="15px">
			
				<td>${freeRead.num}</td>
				<!-- �Խù� ��ȣ -->
				<td>${freeRead.title}</td>
				<!--  �Խù� �ۼ����� -->
				<td>${freeRead.content  }</td>
				<!--  �Խù� �ۼ���ID -->
				<td>${freeRead.empid  }</td>
			</tr>
			
	</table>
	<input type="submit" value="����"> 
	<input type="button" value="����" onclick="location.href='./freeDelete.insa?num=${freeRead.num }'" />
	<input type="button" value="���" onclick="location.href='./freeList.insa'"/>
		
		<img src="upload/Desert.jpg"> 
		
		</form>
</body>
</html>