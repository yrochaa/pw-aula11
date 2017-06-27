package jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/IMCjaxrs")
public class MenorMaiorJaxRs {

	@GET
	@Path("/calcular")
	//@Produces("application/json")
	public Calculo CalculaModel(@QueryParam("altura") double altura) {
	  Calculo c = new Calculo(altura,peso);
	  c.calculo();
	  return c;
	}
}