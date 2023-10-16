package matchDetail;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/Attach",loadOnStartup=1)
public class Match extends HttpServlet{
public Match() {
	System.out.println("Match Object is Created");
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String country=req.getParameter("country");
		String match=req.getParameter("match");
		String team1=req.getParameter("team1");
		String team2=req.getParameter("team2");
		String captian1=req.getParameter("captian1");
		String captian2=req.getParameter("captian2");
		String umpire=req.getParameter("umpire");
		String stadium=req.getParameter("stadium");
		String third=req.getParameter("third");
		String capacity=req.getParameter("capacity");
		
		req.setAttribute("name", name);
		req.setAttribute("country", country);
		req.setAttribute("match", match);
		req.setAttribute("team1", team1);
		req.setAttribute("team2", team2);
		req.setAttribute("captian1", captian1);
		req.setAttribute("captian2", captian2);
		req.setAttribute("umpire", umpire);
		req.setAttribute("stadium",stadium);
		req.setAttribute("third",third);
		req.setAttribute("capacity", capacity);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("Information.jsp");
		dispatcher.forward(req,resp);
	}
}
