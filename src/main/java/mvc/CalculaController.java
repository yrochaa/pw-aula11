package mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/calculoIMC")
public class CalculaController extends HttpServlet {
	
	@Override 
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//Prepara para a execu��o.
		String alturaStr = request.getParameter("altura");
		String pesoStr = request.getParameter("peso");
		
		alturaStr = alturaStr == null ? "1" : alturaStr;                    
		pesoStr = pesoStr == null ? "0" : pesoStr;
		
		double altura = Double.parseDouble(alturaStr);
		double peso = Double.parseDouble(pesoStr);
		
		//Executa "regras de neg�cio".
		CalculaModel CalculaModel = new CalculaModel(altura,peso);
		String resultado = CalculaModel.resultado();
		
		//Passa a v�ri�vel para a p�gina JSP.
		request.setAttribute("resultado", resultado);
		
		//Chama p�gina jsp.
		request.getRequestDispatcher("calculadoraIMC_jsp/index.jsp").
			forward(request, response);
	}
}
