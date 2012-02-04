package br.com.afonso.agenda.jdbc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author afonso.jota@gmail.com (Afonso J. Filgueiras)
 */
public class OlaMundoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Ola Mundo</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Ola Mundo!");
		out.println("</body>");
		out.println("</html>");
	}

}
