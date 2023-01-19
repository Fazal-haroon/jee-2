package com.demo.jee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
//        httpServletRequest.getRequestDispatcher("Where my JSP is").forward(httpServletRequest, httpServletResponse);
        System.out.println(httpServletRequest.getParameter("name")); //http://localhost:8080/?name=fazaltuts4u
        String name = httpServletRequest.getParameter("name");
        httpServletRequest.setAttribute("name", name); //http://localhost:8080/?name=fazaltuts4u
        httpServletRequest.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(httpServletRequest, httpServletResponse);
    }
}
