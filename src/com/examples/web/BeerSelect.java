package com.examples.web;

import com.examples.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;


public class BeerSelect extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		// this method is comes from ServletResponse which is an interface as javax.servlet.ServletResponse
		PrintWriter out = response.getWriter(); //this on also of ServletResponse method
		out.println("Beer Selection Advice<br />");
		String c=request.getParameter("color"); 
		//this method is from ServletRequest which is an interface as javax.servlet.ServletRequest
		BeerExpert ob=new BeerExpert();
		List brands=ob.getBrands(c);
		//out.println("<br />Got Beer color: "+c);
		//out.println("<br />Beer Selection Advice:<br/>");
		//Iterator it=brands.iterator();
		/*while(it.hasNext()){
			out.print("<br />try :"+it.next());
		}
		*/
		request.setAttribute("style",brands);
		RequestDispatcher view= request.getRequestDispatcher("result.jsp");
		view.forward(request,response);
		
	}
}