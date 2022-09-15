<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title> 개인정보 조회 페이지 </title>
</head>
<body>
<h1> </h1>

아이디 : <input readonly="readonly" name = "userId" value=${user.userId }> <br/>
비밀번호 : <input readonly="readonly" name = "password" value=${user.password }> <br/>
이름 : <input readonly="readonly" name = "name" value=${user.name }> <br/>


<button  onclick = "location.href = '/user/updateUser'">수정page 이동</button>

</body>
</html>