package com.example.backend4f;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "errore", value = "/errore")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + username + "</h1>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + username + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}