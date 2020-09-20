package kr.ac.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read from data 보내온 데이터를 읽어오기
		
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		
		//예로 아이디가 맞는지 확인함 Process: access to database, perform business logic
		//Bulid HTML code
		PrintWriter out =response.getWriter(); // import 단축기 CTRL+SHIFT+O
		//System.out.println();//sysout CTRL+SPACE 자동완성
		
		String htmlResponse="<html>";
		htmlResponse += "<h2> Your username is "+ username +"<br>";
		htmlResponse += "<h2> Your password is "+ password +"<h2/>";
		htmlResponse += "</html>";
		
		out.println(htmlResponse);
	}

}
