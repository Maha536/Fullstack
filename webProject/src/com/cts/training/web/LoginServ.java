package com.cts.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServ
 */
@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("uname");
		String pwd = request.getParameter("upwd");
		//PrintWriter writer = response.getWriter();
		
		
		/*
		request.setAttribute("username", name.toUpperCase());
		request.setAttribute("password", pwd.concat("Check"));
		*/
		
		ServletContext globalCon = this.getServletContext();
		
		globalCon.setAttribute("username", name.toUpperCase());
		globalCon.setAttribute("password", pwd.concat(" Check"));
		
		
		/*
		HttpSession session = request.getSession();
		
		session.setAttribute("username", name.toUpperCase());
		session.setAttribute("password", pwd.concat("Check"));
		*/
		
		
		if(name.equals("First") && pwd.equals("abc")){
			//response.sendRedirect("welcome.jsp");
			this.getServletContext().getRequestDispatcher("/welcome.jsp").forward(request, response);
		}else{
			//response.sendRedirect("error.jsp");
			this.getServletContext().getRequestDispatcher("/error.html").forward(request, response);
			
		}
	}

}
