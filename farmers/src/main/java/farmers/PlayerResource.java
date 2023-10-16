package farmers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/virat", loadOnStartup = 2)
	public class PlayerResource extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name = req.getParameter("name");
	String sports = req.getParameter("sports");
	String place = req.getParameter("place");
	String experience = req.getParameter("experience");

	System.out.println(" Name : " + name);
	System.out.println("Sports : " + sports);
	System.out.println("Place: " + place);
	System.out.println("Experience : " + experience);

	resp.setContentType("text/plain");
	PrintWriter writer = resp.getWriter();
	writer.print(name + " interested in sport " + sports + " born in " + place + " having experience " + experience
	+ "years.");
	writer.print("Information saved successfully.....");

	}
	}


