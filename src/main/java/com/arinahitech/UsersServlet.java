package com.arinahitech;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UsersServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter printWriter = response.getWriter();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/java_ee",
                "postgres",
                "123"
            );
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
            printWriter.println("<html>");
            printWriter.println("<h2>--------------------------------------------------</h2>");
            while (resultSet.next()) {
                printWriter.println(
                    resultSet.getInt("id") + " | " +
                        resultSet.getString("name") + " | " +
                        resultSet.getString("year"));
                printWriter.println("<h2>--------------------------------------------------</h2>");
            }
            printWriter.println("</html>");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
