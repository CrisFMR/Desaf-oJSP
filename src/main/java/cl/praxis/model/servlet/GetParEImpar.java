package cl.praxis.model.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.model.funciones.ParEImpar;

@WebServlet("/GetParEImpar")
public class GetParEImpar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetParEImpar() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String value = new String();
		
		value = request.getParameter("valor");
		int integer = Integer.parseInt(value);
		boolean pair = ParEImpar.isPair(integer);
		
		try {
			if(pair) {
				response.getWriter().append("Número " + value + " es par.");
			} else {
				response.getWriter().append("Número " + value + " es impar.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
