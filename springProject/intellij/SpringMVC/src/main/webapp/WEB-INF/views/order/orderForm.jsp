<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-12
  Time: 오후 3:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>주문</h1>
<hr>
<form method="post">
    <h3>상품 1</h3>
    id - <input type="text" name="orderItem[0].itemId"><br> <%--setItemId(사용자 입력 파라미터 데이터)--%>
    개수 - <input type="number" name="orderItem[0].number"><br>
    주의 = <input type="text" name="orderItem[0].remark"><br>

    <h3>상품 2</h3>
    id - <input type="text" name="orderItem[1].itemId"><br> <%--setItemId(사용자 입력 파라미터 데이터)--%>
    개수 - <input type="number" name="orderItem[1].number"><br>
    주의 = <input type="text" name="orderItem[1].remark"><br>

    <h3>상품 3</h3>
    id - <input type="text" name="orderItem[2].itemId"><br> <%--setItemId(사용자 입력 파라미터 데이터)--%>
    개수 - <input type="number" name="orderItem[2].number"><br>
    주의 = <input type="text" name="orderItem[2].remark"><br>

    <h3>배송지 주소</h3>
    우편번호 : <input type="text" name="address.zipcode" ><br>
    주소1 : <input type="text" name="address.address1"><br>
    주소2 : <input type="text" name="address.address2"><br>
    <input type="submit">

</form>


</body>
</html>
