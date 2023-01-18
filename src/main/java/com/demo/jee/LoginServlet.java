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
        PrintWriter writer = httpServletResponse.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Servlet</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("Dummy Stuff");
        writer.println("</body>");
        writer.println("</html>");
    }
}
