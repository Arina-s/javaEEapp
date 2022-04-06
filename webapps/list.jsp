<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>List</title>
    </head>
    <body>
        <h1>List</h1>
         <p>
            <ul>
               <li>One</li>
               <li>Two</li>
               <li>Three</li>
            </ul>
         </p>
         <%
             java.util.Date now = new java.util.Date();
             String date = "Текущая дата: " + now;
             for (int i = 0; i < 5; i++) {
                 out.println("<p> Hello " + i + " </p>");
             }
         %>
         <%= date %>
    </body>
</html>