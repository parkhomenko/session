package com.hillel.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/users")
public class UsersServlets extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    RequestDispatcher dispatcher = req.getRequestDispatcher("jsps/users.jsp");

    List<User> users = new ArrayList<>();

    User user = new User();
    user.setName("John");
    user.setAge(50);

    User user2 = new User();
    user2.setName("Jack");
    user2.setAge(35);

    users.add(user);
    users.add(user2);

    req.setAttribute("users", users);

    dispatcher.forward(req, resp);
  }
}
