<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Hello, I am a Java web app!</title>
    </head>
    <body>
        <h1>Simple Java Web App Demo</h1>
        <p>To invoke the java servlet click <a href="/main">here</a></p>
        <%@ page import="java.util.Date, com.arinahitech.Info" %>
        <%
            Info info = new Info();
        %>
        <%= new Date() %>
        <%= info.getInfo() %>
    </body>
</html>