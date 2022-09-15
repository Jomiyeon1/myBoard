<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입 완료</title>

<script type="text/javascript">

	function f_clickFunc(){
		self.location = "/user/getUser/${user.userId}"
	}
</script>
</head>
<body>
<h1>${user.userId }님 회원가입을 환영합니다.</h1>

<button onclick = "f_clickFunc()">정보조회</button>

</body>
</html>