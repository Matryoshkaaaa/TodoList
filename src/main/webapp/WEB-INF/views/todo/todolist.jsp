<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Todo List</h1>

	<table border="1">
		<tr>
			<th>번호</th>
			<th>완료?</th>
			<th>Todo Subject</th>
			<th>기한</th>
			<th></th>
			<th></th>
		</tr>
		<c:choose>
			<c:when test="${not empty todoListVO.todolist}">
				<c:forEach items="${todoListVO.todolist}" var="todo">
					<tr>
						<td class="td">${todo.id}</td>
						<td class="td">${todo.status}</td>
						<td class="td">${todo.subject}</td>
						<td class="td">${todo.date}</td>
						<td class="td"><c:if test="${todo.status != 'DONE'}">
								<a href="<c:url value='/todo/complete/${todo.id}' />">
									<button> 완료</button>
								</a>
							</c:if></td>
						<td class="td"><a
							href="<c:url value='/todo/delete/${todo.id}' />">
								<button >삭제</button>
						</a></td>
					</tr>
				</c:forEach>
			</c:when>
			
		</c:choose>
	</table>

	<br>
	<a href="/todo/write">추가하기</a>


</body>
</html>