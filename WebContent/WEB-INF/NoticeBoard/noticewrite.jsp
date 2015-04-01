<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2> notice write </h2>

<form action="./noticeWrite.insa" method="post">
	제목 : <input type="text" name="title"><br/>
	내용 : <input type="text" name="content">
	
	<input type="submit" value="등록">
	<input type="button" value="취소" onclick="cancle()">

</form>
<script type="text/javascript">
	function cancle() {
		location.href="./noticeList.insa";
	}
</script>

</body>
</html>