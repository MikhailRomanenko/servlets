package com.sample;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Misha on 22.08.2017.
 */
public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setBufferSize(10);
        PrintWriter writer = resp.getWriter();
        writer.println("Servlet's doGet");
        writer.println(String.format("Context path: %s", req.getContextPath()));
        writer.println(String.format("Servlet path: %s", req.getServletPath()));
        writer.println(String.format("Path info: %s", req.getPathInfo()));
        writer.flush();
        req.getRequestDispatcher("/add").include(req, resp);
    }
}
