<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-19
  Time: 오후 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>게시글수정</title>
    <style>
        td{
            padding : 10px;
        }
    </style>
</head>
<body>
<h1>게시글 수정</h1>
<hr>
<
<hr>
<form method="post" enctype="multipart/form-data">
    <input type="hidden" name="bno" value="${board.bno}">
    <%-- 새로운 파일을 업로드 할 수 있다
    이전에 업로드한 파일이 있을 수 있다
    --%>
    <table border ="1">
        <tr>
            <td>제목</td>
            <td><input type="text" name="title" value="${board.title}" required></td>
        </tr>
        <tr>
            <td>내용</td>
            <td><textarea name="content" cols="40" rows="4"  required>${board.content}</textarea></td>
        </tr>
        <tr>
            <td>작성자</td>
            <td><input type="text" name="writer" value="${board.writer}" required></td>
        </tr>
        <c:if test="${board.file ne null}">
        <tr>
            <td>첨부된 파일</td>
            <td>
                <input type="hidden" name="oldfile" value="${board.file}">
                ${board.file}
            </td>
        </tr>
        </c:if>

        <tr>
            <td>첨부파일</td>
            <td><input type="file" name="file"></td>
        </tr>
    </table>
    <tr>
        <td></td>
        <td><input type="reset"></td>
        <td><input type="submit"></td>
    </tr>

</form>



</body>
</html>
