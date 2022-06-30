package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s2url")
public class Servlet2 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		//general settings
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		
		//read 1st form,2nd form data
		
		 pw.println("<br><h3>First Form Data is</h3>");
		 pw.println("<br>Name is:"+req.getParameter("pname"));
		 pw.println("<br>Father name is:"+req.getParameter("fname"));
		 pw.println("<br>Age is:"+req.getParameter("page"));
		 pw.println("<br>Marital Status is:"+req.getParameter("ms"));
		 
		 pw.println("<br><h3>Second form data is:</h3>"+ req.getParameter("st1")+"<br>"+req.getParameter("st2"));
		 
		 pw.close();
	     
	}//doget
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
