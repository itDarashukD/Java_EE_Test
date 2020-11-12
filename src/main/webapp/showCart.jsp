<%--
  Created by IntelliJ IDEA.
  User: Дима
  Date: 12.11.2020
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showCart</title>
</head>
<body>
<%@ page import="TestCart.Cart" %>

<% Cart cart = (Cart) session.getAttribute("cart"); %>
<p>name: <%= cart.getName() %>
</p>

<p>quantity: <%=cart.getQuantity() %>
</p>

</body>
</html>
