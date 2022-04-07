package com.arinahitech;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCookiesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie[] cookies = request.getCookies();
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        for (int i = 0; i < cookies.length; i++) {
            printWriter.println("<h2> " + cookies[i].getName() + " : " + cookies[i].getValue() + " </h2>");
        }
        printWriter.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}