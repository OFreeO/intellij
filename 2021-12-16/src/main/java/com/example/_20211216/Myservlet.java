package com.example._20211216;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Myservlet", value = "/Myservlet")
public class Myservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
//        response.setCharacterEncoding("utf-8");
        PrintWriter out =response.getWriter();
        out.println("<html>" + "<head></head>" +
                "<body>aaa</body>" + "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
