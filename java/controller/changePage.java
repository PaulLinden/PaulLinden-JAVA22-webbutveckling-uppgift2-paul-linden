package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/changePage")
public class changePage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public changePage() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String Page = request.getParameter("Page");

		if (Page == null) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/Main.jsp");
			requestDispatcher.forward(request, response);
			System.out.println("Nope!");
		} else if (Page.equals("One")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/Main.jsp");
			requestDispatcher.forward(request, response);
			System.out.println("1");
		} else if (Page.equals("Two")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/PageTwo.jsp");
			requestDispatcher.forward(request, response);
			System.out.println("2");
		} else if (Page.equals("Three")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/PageThree.jsp");
			requestDispatcher.forward(request, response);
			System.out.println("3");
		} else if (Page.equals("Logout")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Logout");
			requestDispatcher.forward(request, response);
			System.out.println("4");
		} else {
			System.out.println("Error!");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
