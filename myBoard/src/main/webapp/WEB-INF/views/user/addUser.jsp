<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>addUser</title>
</head>
<body>
<h1>회원가입</h1>

<form action="/user/addUser" method="post">
	
	아이디  : <input id="userId" name = "userId"> <br/>
	비밀번호 : <input type="password" id="password" name = "password" > <br/>
	이름 : <input id="name" name = "name"> <br/>
	
	<button type="submit">회원가입</button>
	

</form>
</body>
</html>