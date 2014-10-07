package com.test.rest;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Servlet implementation class Test
public class Test extends HttpServlet {
       private static final long serialVersionUID = 1L;
       @Override
       protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, 
		IOException {
               PrintWriter p = resp.getWriter();
               p.print("WORKING…………...");
       }
}