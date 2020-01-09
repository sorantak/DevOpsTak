package sec01.ex01;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException{
		System.out.println("FirstServlet) call init method");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException{
		System.out.println("FirstServlet) call doGet method");
	}
	
	@Override
	public void destroy() {
		System.out.println("FirstServlet) call destroy method");
	}
}
