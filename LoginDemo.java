package LoginD;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginDemo")
public class LoginDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//System.out.println("do post");
		String username=request.getParameter("userID");
	    String password=request.getParameter("password");
		Database loginDAO =new Database();
/*		//RequestDispatcher dispatcher;
		if(loginDAO.isValidUser(username, password).equals(""))

		{
			//dispatcher = request.getRequestDispatcher("index.html"); 
			PrintWriter writer= response.getWriter();
			writer.println(loginDAO.isValidUser(username, password));
			//dispatcher.include(request, response);
			
			
			
			}
		else*/
		{
			PrintWriter writer= response.getWriter();
			writer.println("valid credential");
			RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("LoginDemo.html");
		dispatcher.forward(request, response);
	}

	}

	/*private boolean isvaliduser(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}
*/
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
	
	