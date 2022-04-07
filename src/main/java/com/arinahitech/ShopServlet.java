package com.arinahitech;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShopServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String title = request.getParameter("title");
        String count = request.getParameter("count");
        if (title == null || count == null) {
            response.getWriter().println("<html>");
            response.getWriter().println("<h2> Added title and count! </h2>");
            response.getWriter().println("</html>");
        } else {
            Item item = new Item(title, Integer.parseInt(count));
            Basket basket = (Basket) request.getSession().getAttribute("basket");
            if (basket == null) {
                basket = new Basket();
            }
            basket.addItem(item);
            request.getSession().setAttribute("basket" , basket);
            Item[] items = basket.getItems();
            response.getWriter().println("<html>");
            for (int i = 0; i < items.length; i++) {
                response.getWriter().println("<h2> Title: " + items[i].getTitle() + " </h2>");
                response.getWriter().println("<h2> Count: " + items[i].getCount() + " </h2>");
                response.getWriter().println("<br>");
            }
            response.getWriter().println("</html>");
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {

    }

}
