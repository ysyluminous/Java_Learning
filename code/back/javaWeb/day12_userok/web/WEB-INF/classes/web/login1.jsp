<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${msg }
<form action="${pageContext.request.contextPath }/servlet/login" method="post">
	用户名：<input type="text" name="username"/><br/>
	密码：<input type="password" name="password"/><br/>
	<input type="submit" value="登录"/><br/>
</form>

</body>
</html>