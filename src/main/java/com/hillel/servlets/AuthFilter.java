package com.hillel.servlets;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
      FilterChain filterChain) throws IOException, ServletException {
    String login = servletRequest.getParameter("login");
    String password = servletRequest.getParameter("password");

    if (login.equals("john") && password.equals("secret")) {
      filterChain.doFilter(servletRequest, servletResponse);
    } else {
      throw new ServletException("Incorrect name or password");
    }
  }

  @Override
  public void destroy() {
  }
}
