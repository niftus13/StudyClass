<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.red {color = red;
	
}
</style>
</head>
<body>

	${members[0]}
	<br> ${members[1]} / ${members[1].name} / ${member[0].name}
	<br>

	<c:out value="${members[0].name}" />
	<br>

	<c:out value="${members[1].name}" escapeXml="false">
		<span class="red">이름 입력값 없음</span>
	</c:out>
	<br>
	
	<c:out value="${members[2].name}" escapeXml="false">
		<span class="red">이름 입력값 없음</span>
	</c:out>
	<br>

	<hr>
	${members}






</body>
</html>