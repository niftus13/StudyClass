<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-15
  Time: 오전 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>fileUpload3</title>
</head>
<body>
<h1>리포트 업로드 완료 3</h1>
<h3> report
    이름 : ${report.sname}<br>
    학번 : ${report.snum}<br>
    파일 이름 : ${report.report.originalFilename}
<%--    첫번째 report : 커맨드 객체,
        두번째 report : get.Report(),
        세번째 report : getOriginalFileName()--%>
    <br>
    <img src = "/uploadfile/report/${report.report.originalFilename}">
<%--    http://localhost:8080/uploadfile/report/erd.PNG--%>

</h3>

</body>
</html>