package com.arinahitech;

import java.util.UUID;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetCookiesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookieId = new Cookie("user_id", UUID.randomUUID().toString());
        Cookie cookieName = new Cookie("user_name", "Tomas");
        cookieName.setMaxAge(-1);
        response.addCookie(cookieId);
        response.addCookie(cookieName);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
