<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/style2.css">
</head>
<body>
	<%@include file= "header.jsp"  %>
	<div>
		<p>
		<label for="name">name</label>
		<input type="text" name="name" size=30>
		</p>
		<p>
		<label for="id">id</label>
		<input type="text" name="id" size=30>
		</p>
	</div>
	<%@include file= "footer.jsp" %>
</body>
</html>