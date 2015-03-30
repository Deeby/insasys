<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
  function modify(){
  location.href="./update.insa?num=${dto.num}"
  }
  function Delete() {
   location.href="./delete.insa?num=${dto.num}"
  }
</script>
</head>
<body>
<table>
  <tr>
  <td>제목</td><td>${dto.title }</td>
  </tr>
</table>
 <button onclick="modify()">수정</button>
 <button onclick="Delete()">삭제</button>
</body>
</html>