package com.example;
 
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
 
public class HelloServlet extends HttpServlet {
 
    @Override
    public void init() {
        System.out.println("Servlet initialized");
    }
 
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Hello from a Java Servlet!</h1>");
    }
 
    @Override
    public void destroy() {
        System.out.println("Servlet destroyed");
    }
}