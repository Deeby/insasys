<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type = "text/javascript" src="WEB-INF/lib/jquery-1.7.1.js"></script>
<script type="text/javascript">
function writeFormCheck() {
   
	if($("#title").val() == null || $("#title").val() == ""){
		alert("������ �Է��� �ּ���!");
		$("#title").focus();
		return false;
	}
	
	if($("#content").val() == null || $("#content").val() == ""){
		alert("������ �Է��� �ּ���!");
		$("#content").focus();
		return false;
	}
	
	return true;
}
</script>
</head>
<body>
	<form action="./update.insa" method="post" onsubmit="return writeFormCheck()" enctype="multipart/form-data">	
	<table class="boardWrite">	
		<tr>
			<th>����</th>
			<td>
				<input type="text" id="title" name="title" value="${dto.title}"/>
				<input type="hidden" id="num" name="num" value="${dto.num}" />
			</td>			
		</tr>
		<tr>
			<th>����</th>
			<td><textarea id="content" name="content">${dto.content}</textarea></td>			
		</tr>
	</table>
	<br />
	<input type="reset" value="���ۼ�" />
	<input type="submit" value="Ȯ��" />	
	</form>
</body>
</html>