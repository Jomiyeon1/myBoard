<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ������ �Ϸ�</title>

<script type="text/javascript">

	function f_clickFunc(){
		self.location = "/user/getUser/${user.userId}"
	}
</script>
</head>
<body>
<h1>${user.userId }�� ȸ�������� ȯ���մϴ�.</h1>

<button onclick = "f_clickFunc()">������ȸ</button>

</body>
</html>