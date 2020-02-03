package com.cts.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServ
 */
@WebServlet("/FormServ")
public class FormServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("uname");
		String email = request.getParameter("umail");
		String phone = request.getParameter("utel");
		
		PrintWriter writer = response.getWriter();
		
		writer.write("<h1>Name :"+name+"</h1>");
		writer.write("<h1>email :"+email+"</h1>");
		writer.write("<h1>phone :"+phone+"</h1>");
		writer.write("Thank you, We will contact you soon...");
	}

}
