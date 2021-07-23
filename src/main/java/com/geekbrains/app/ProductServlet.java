package com.geekbrains.app;

import com.geekbrains.app.object.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "ProductServlet", urlPatterns = "/prod")
public class ProductServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
//http://localhost:8080/jee_war_exploded/prod?a=A&b=B&c=C
        String firstParam = req.getParameter("a");
        String secondParam = req.getParameter("b");
        String thirdParam = req.getParameter("c");

        Map<Integer, Product> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, new Product(firstParam, secondParam, thirdParam));
        }

        PrintWriter out = resp.getWriter();
        out.printf("<html><body>");
        for (int i = 0; i <map.size(); i++) {
            out.printf("<h1>" + map.get(i).toString() +"<h1>");
        }
        out.printf("</body></html>");
        out.close();
    }

}
