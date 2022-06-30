package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/s1url")
public class Servlet1 extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		PrintWriter pw=null;
		String name=null;
		String fname=null;
		String age=null;
		String mstatus=null;
		
		//general settings
		
		 pw=res.getWriter();
	     res.setContentType("text/html");
	     
	     //read data from form1/request1 data
	     
	     name=req.getParameter("pname");
	     fname=req.getParameter("fname");
	     age=req.getParameter("page");
	     mstatus=req.getParameter("ms");
	     
	if(mstatus==null) { 
		mstatus="single";
	}
	
	
	//Generate Second Dynamic Form here
	if(mstatus.equals("married")) {
		
		pw.println("<form action='s2url' method='post'>");
		pw.println("<b>Spouse Name:</b><input type='text' name='st1'><br>");
		pw.println("<b>No of Children:</b><input type='text' name='st2'><br>");
		pw.println("<input type='submit' value='submit'><br>");
		pw.println("</form>");
	}//else
	else {
		
		pw.println("<form action='s2url' method='post'>");
		pw.println("<b>When do U want to Marry:</b><input type='text' name='st1'><br>");
		pw.println("<b>Why do U want to Merry:</b><input type='text' name='st2'><br>");
		pw.println("<input type='submit' value='submit'><br>");
		pw.println("</form>");
		
	}//else
	
	pw.close();
	
	
	}//doget

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}//dopost

}//class
