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

<form action="./noticeModify.insa" method="get">
	 <input type="hidden" value="${noticeRead.getNum() }" name="num">
	<table border="1" align="center" width="100%">
		<tr height="10px" align="center">
			<td>��ȣ</td>
			<td>����</td>
			<td>�ð�</td>
			<td>�ۼ���</td>

		</tr>

		<!-- glist�� ���� ��ŭ for�� ���� -->
		
		<%-- <c:forEach items="${noticeRead }" var="noticeRead"> --%>
			<tr align="center" height="15px">
			
				<td>${noticeRead.num}</td>
				<!-- �Խù� ��ȣ -->
				<td>${noticeRead.title}</td>
				<!--  �Խù� �ۼ����� -->
				<td>${noticeRead.content  }</td>
				<!--  �Խù� �ۼ���ID -->
				<td>${noticeRead.empid  }</td>
			</tr>
	<%-- 	</c:forEach> --%>
	</table>
	<input type="submit" value="����"> 
	<input type="button" value="����" onclick="location.href='./noticeDelete.insa?num=${noticeRead.num }'" />
	<input type="button" value="���" onclick="location.href='./noticeList.insa'"/>
		</form>
</body>
</html>