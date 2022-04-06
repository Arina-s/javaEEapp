package com.arinahitech;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String message = "Earth";
        if (name != null) {
            message = name;
            if (surname != null) {
                message += " " + surname;
            }
        } else if (surname != null) {
            message = surname;
        }
        printWriter.println("<html>");
        printWriter.println("<h1> Hello " + message + "! </h1>");
        printWriter.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Hello, people!!!");
    }
}
