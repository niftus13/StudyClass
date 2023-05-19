<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-18
  Time: 오후 5:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>LIST</title>
</head>
<body>

<h1>게시판</h1>
<hr>

<table>
    <tr>
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
    </tr>
    <c:forEach items="${list}" var="board">
        <tr>
            <td>${board.bno}</td>
            <td><a href = "/board/read?bno=${board.bno}">${board.title}</a></td>
            <td>${board.writer}</td>
            <td>${board.regdate}</td>
        </tr>
    </c:forEach>
</table>

<a href = "/board/write">글쓰기</a>




</body>
</html>
