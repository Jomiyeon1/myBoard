<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>addUser</title>
</head>
<body>
<h1>ȸ������</h1>

<form action="/user/addUser" method="post">
	
	���̵�  : <input id="userId" name = "userId"> <br/>
	��й�ȣ : <input type="password" id="password" name = "password" > <br/>
	�̸� : <input id="name" name = "name"> <br/>
	
	<button type="submit">ȸ������</button>
	

</form>
</body>
</html>