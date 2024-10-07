<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Todo List 추가</h1>

	<form action="/todo/write" method="post">
		<label for="subject">제목:</label> <input type="text" id="subject"
			name="subject" required> <br> <label for="date">기한:</label>
		<input type="date" id="date" name="date" required> <br> <input
			type="submit" value="추가하기">
	</form>

	<br>
	<a href="/todo/list">돌아가기</a>

</body>
</html>