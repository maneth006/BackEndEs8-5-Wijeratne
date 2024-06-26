package com.example.backend4f;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("User-Agent:" + request.getHeader("User-Agent"));
        System.out.println("Accept-Encoding:" + request.getHeader("Accept-Encoding"));
        System.out.println("Connection:" + request.getHeader("Connection"));

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + BENVENUTO + "</h1>");
        out.println("</body></html>");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpServletResponse.SC_BAD_REQUEST;

    }

    public void destroy() {
    }
}