package net.ruangtedy.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ruangtedy.bey.client.SimpleClient;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  private String message;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	      message = "Hello World";

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

	      // Actual logic goes here.
	   //   PrintWriter out = response.getWriter();
	    ///  out.println("<h1>" + message + "</h1>");
	      request.getRequestDispatcher("/WEB-INF/HelloJSP.jsp").include(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String q2 = request.getParameter("radios");
		 SimpleClient client=new SimpleClient();
		 if(q2.equalsIgnoreCase("on")){
			 client.sendCommand(true);
			 
		 }else if(q2.equalsIgnoreCase("off")){
			 client.sendCommand(false);
		 }
			doGet(request, response);

	}
}
