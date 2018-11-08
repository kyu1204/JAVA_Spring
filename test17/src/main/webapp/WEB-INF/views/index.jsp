<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String context = request.getContextPath();
	%>
	
	<form action="<%=context%>/studentView" method="post">
		이름 : <input type="text" name="name"><br/>
		나이 : <input type="text" name="age"><br/>
		학번 : <input type="text" name="classNum"><br/>
		전공 : <input type="text" name="major"><br/>
		<input type="submit" value="전송">
	</form>

</body>
</html>