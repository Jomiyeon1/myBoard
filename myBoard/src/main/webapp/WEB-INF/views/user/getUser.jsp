<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title> �������� ��ȸ ������ </title>
</head>
<body>
<h1> </h1>

���̵� : <input readonly="readonly" name = "userId" value=${user.userId }> <br/>
��й�ȣ : <input readonly="readonly" name = "password" value=${user.password }> <br/>
�̸� : <input readonly="readonly" name = "name" value=${user.name }> <br/>


<button  onclick = "location.href = '/user/updateUser'">����page �̵�</button>

</body>
</html>