package cl.praxis.model.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.model.funciones.Factorial;


@WebServlet("/GetFactorial")
public class GetFactorial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public GetFactorial() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String value = new String();
		 	
		value = request.getParameter("valor");
		int integer = Integer.parseInt(value);
		int factorial = Factorial.getFact(integer);
		response.getWriter().append("Para " + value +  " su factorial es: " + factorial + ".");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
