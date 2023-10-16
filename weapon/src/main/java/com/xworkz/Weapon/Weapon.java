package com.xworkz.Weapon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/GUN", loadOnStartup = 1)
public class Weapon extends HttpServlet {
	public Weapon()
	{
		System.out.println("Object is Created");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String gun=req.getParameter("Gun_Name");
		String made=req.getParameter("By");
		String price=req.getParameter("Price");
		String type=req.getParameter("Type");
		
		System.out.println(gun);
		System.out.println(made);
		System.out.println(price);
		System.out.println(type);
		
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		
		writer.print("<!doctype html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "  <head>\r\n"
				+ "    <meta charset=\"utf-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "    <title>Project</title>\r\n"
				+ "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\r\n"
				+ "  <style>\r\n"
				+ "  .container-fluid {\r\n"
				+ "    background-color: black;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .navbar-brand {\r\n"
				+ "    color: white;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  .nav-item.dropdown {\r\n"
				+ "    color: white;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "  /* Add a custom class for the dropdown menu */\r\n"
				+ "  .custom-dropdown-menu {\r\n"
				+ "    background-color: white; /* Set the background color to white */\r\n"
				+ "  }\r\n"
				+ "  .Design{\r\n"
				+ "  background-color:red;\r\n"
				+ "  text-align:centre;\r\n"
				+ "  margin-left:500px;\r\n"
				+ "  width:400px ;\r\n"
				+ "  height:350px ;\r\n"
				+ "  padding-top:40px ;\r\n"
				+ "  padding-left:70px ;\r\n"
				+ "  margin-top:80px ;\r\n"
				+ "  }\r\n"
				+ "  \r\n"
				+ "  \r\n"
				+ "</style>\r\n"
				+ "  </head>\r\n"
				+ "  <body>\r\n"
				+ "  <nav class=\"navbar bg-body-tertiary\">\r\n"
				+ "  <div class=\"container-fluid\">\r\n"
				+ "    <a class=\"navbar-brand\">Navbar</a>\r\n"
				+ "    </li>\r\n"
				+ "  <li class=\"nav-item dropdown\">\r\n"
				+ "    <a class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-expanded=\"false\">Dropdown</a>\r\n"
				+ "    <ul class=\"dropdown-menu\">\r\n"
				+ "      <li><a class=\"dropdown-item\" href=\"index.html\">Home</a></li>\r\n"
				+ "    </ul>\r\n"
				+ "  </li>\r\n"
				+ "  </div>\r\n"
				+ "</nav>");
				writer.print("<br> Gun_Name="+gun);
				writer.print("<br> Made_by="+made);
				writer.print("<br> Price="+price);
				writer.print("<br> Type="+type);
				writer.print("<br><span style='color:green;'>It is Succesfully Stored");
				writer.print ("  <body>\r\n");
				writer.print( "<html lang=\"en\">\r\n");
				 
	}

}
