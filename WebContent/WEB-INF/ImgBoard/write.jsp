<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
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
<body>
<div class="wrapper">	
	<h3>�� �� ����</h3>
	<form action="/write.insa" method="post" onsubmit="return writeFormCheck()" enctype="multipart/form-data">	
	<table class="boardWrite">	
		<tr>
			<th><label for="title">����</label></th>
			<td>
				<input type="text" id="title" name="title" class="boardSubject"/>
				<input type="hidden" id="empid" name="empid" value="${empid}" />
			</td>			
		</tr>
		<tr>
			<th><label for="content">����</label></th>
			<td><textarea id="content" name="content" class="boardContent"></textarea></td>			
		</tr>
		<tr>
			<th><label for="file">����</label></th>
			<td><input type="file" id="file" name="file" /><span class="date">&nbsp;&nbsp;*&nbsp;���Ƿ� ���ϸ��� ����� �� �ֽ��ϴ�.</span></td>			
		</tr>				
	</table>
	<br />
	<input type="reset" value="���ۼ�" class="writeBt"/>
	<input type="submit" value="Ȯ��" class="writeBt"/>	
	</form>
</div>
</body>
</html>