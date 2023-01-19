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

    private UserValidationService service = new UserValidationService();

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
//        httpServletRequest.getRequestDispatcher("Where my JSP is").forward(httpServletRequest, httpServletResponse);
        System.out.println(httpServletRequest.getParameter("name")); //http://localhost:8080/?name=fazaltuts4u
        String name = httpServletRequest.getParameter("name");
//        httpServletRequest.setAttribute("name", name); //http://localhost:8080/?name=fazaltuts4u
//        httpServletRequest.setAttribute("password", httpServletRequest.getParameter("password"));
        httpServletRequest.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(httpServletRequest, httpServletResponse);
    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String name = httpServletRequest.getParameter("name");
        String password = httpServletRequest.getParameter("password");

        boolean userValid = service.isUserValid(name, password);

        if (userValid) {
            httpServletRequest.setAttribute("name", name);
            httpServletRequest.setAttribute("password", password);
            httpServletRequest.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(httpServletRequest, httpServletResponse);
        } else {
            httpServletRequest.setAttribute("errorMsg", "Invalid Credentials!");
            httpServletRequest.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(httpServletRequest, httpServletResponse);
        }
    }
}
