package services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Client;
import model.Quote;
import repository.CrmRepository;

@Path("/service")
public class ServiceImpl {
 private CrmRepository repository = new CrmRepository();
 
 	@POST
	@Path("/client")	
	@Consumes({MediaType.APPLICATION_JSON})
 	@Produces({MediaType.APPLICATION_JSON})
	public Client subscribe(Client client) {		
 		
 		return client;		
 	}
 
	@POST
	@Path("/quote/{clientid}")	
	@Consumes({MediaType.APPLICATION_JSON})
 	@Produces({MediaType.APPLICATION_JSON})
	public Quote generateQuote(@PathParam("clientid")int client) {
		Quote quote = new Quote();
 		return quote;		
 	}
	
}