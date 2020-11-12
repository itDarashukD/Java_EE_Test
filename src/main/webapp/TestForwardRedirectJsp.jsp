<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Дима
  Date: 11.11.2020
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SecondJsp</title>
</head>
<body>
<h1>I hope that in this time all will be good!</h1>
<p>
    <% Date date = new java.util.Date(); %>
    <% String str = "текущее время " + date; %>

    <%=str %>

    <% for (int i = 0; i < 3; i++) {


        out.println("<p>"+"только бы не накаркать!"+ i+"</p>");   }; %>

    <%="возвращаем строку этими тегами"           %>
<p> ___________________________________________ </p>
<p> //создание Директивы - с ее помощью можно импортиить классы и методы сюда  </p>
<p>    <%@ page import="java.util.Date" %>
    <%=new Date() %> </p>
<p> ___________________________________________ </p>
        <p> //Импорт класса и его метода из наших пакетов с помощью Директивы </p>
    <%@ page import="Logik.TestDirective" %>

  <% TestDirective testDirect = new TestDirective(); %>

    <%=testDirect.returnString() %>
<p> ___________________________________________ </p>
<p> //создаем нейм,для последующей подстановки в запрос URL </p>

<% String name = request.getParameter("name"); %>
<% String lastName = request.getParameter("lastName"); %>
<%="эту строку пишел будущий программист "+ name +" "+ lastName+" "%>

<p> ___________________________________________ </p>

<p> //Сюда перенаправляем пользователя с помощью Forward , Redirect </p>

</p>
</body>
</html>
