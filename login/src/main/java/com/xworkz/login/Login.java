package com.xworkz.login;

import java.io.IOException;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/Attach" }, loadOnStartup = 1)
public class Login extends HttpServlet { 
	public Login() {
		System.out.println("Login Page is Created");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		if (email.equals("admin") && password.equals("password")) {
			req.setAttribute("email", email);
			RequestDispatcher dispatcher = req.getRequestDispatcher("Display.jsp");
			dispatcher.forward(req, resp);
		} else {
			
			req.setAttribute("error", "Credintial Not Match");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, resp);
		}

		RequestDispatcher dispatcher1 = req.getRequestDispatcher("Address.jsp");
		HttpSession session = req.getSession(true);
		session.setAttribute("email",email);
		dispatcher1.forward(req, resp);

	}

}
