package PasswordDemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validate
 */
@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String userName=request.getParameter("username");
		String userPassword=request.getParameter("password");
		
		if(userName.equals("Yash") && userPassword.equals("Raj")) {
			RequestDispatcher reqDsp=request.getRequestDispatcher("/home.jsp");
			reqDsp.forward(request,response);
		}
		else {
			ServletContext sc=request.getServletContext();
			RequestDispatcher rd=sc.getRequestDispatcher("/error.jsp");
			rd.forward(request,response);
		
	}

}
}
