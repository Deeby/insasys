<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">

	function cancle() {
		location.href="./login.jnb";
	}
	function cancle2(){
		location.href="./memberInsert.jnb";
	}
	//POST������� ������ ����ϴ� ��ũ��Ʈ!!�߿�!!!
	function test1(){
		var testF = document.testform;
		testF.action="./login.jnb";
		testF.method="POST";
		testF.submit();
	}
</script>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/woogesi.css"/>"/>
</head>
<body>
	<form action="/dept_insert.insa" method="get">
		<table border="1" align="center" width="100%">
			<tr height="10px" align="center">
				<td>��ȣ</td>
				<td>����</td>
				<td>�۾���</td>
				<td>�ð�</td>
			</tr>		
			
			<!-- glist�� ���� ��ŭ for�� ���� -->
			<c:forEach items="" var="glist">
			<tr align="center" height="15px">
					<td></td>			<!-- �Խù� ��ȣ -->
					<td><a href="a"></a></td>
					<td></td> 			<!-- �Խù�  �ۼ���-->
					<td></td> 			<!--  �Խù� �ۼ����� -->
					</tr>
			</c:forEach>
		</table>
		<table align="center">
		<tr>
		<td><input type="submit" value="�۾���" /></td>
		</tr>
		</table>
	<!-- 	<table align="right">		
			<tr>
			<td><input type="button" value="�α���" onclick="test1()" ></td>
			<td><input type="button" value="ȸ������" onclick="cancle2()"></td>	
			<td><input type="submit" value="�� ����" ></td>					
			</tr>
		</table>  -->
		</form>
		 
		</body>

</html>