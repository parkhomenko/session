package com.hillel.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    PrintWriter writer = resp.getWriter();

    String login = req.getParameter("login");

    Cookie cookie = new Cookie("username", login);
    resp.addCookie(cookie);

    User user = new User();
    user.setName(login);
    user.setAge(50);

    HttpSession httpSession = req.getSession();
    httpSession.setAttribute("user", user);

    writer.println("<html>");
    writer.println("<body>");
    writer.println("You have registered successfully");
    writer.println("<a href=\"/context/info\">Main Page</a>");
    writer.println("</body>");
    writer.println("</html>");
  }
}
