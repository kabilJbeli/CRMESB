package services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import DAO.ClientDAO;
import DAO.QuoteDAO;
import entities.Client;
import entities.Quote;

@Path("/service")
public class ServiceImpl {
 ClientDAO clientDAO = new ClientDAO();
 QuoteDAO quoteDAO = new QuoteDAO();
 	@POST
	@Path("/GenerateClient")	
	@Consumes({MediaType.APPLICATION_JSON})
	public boolean GenerateClient(Client client) {		
 		return clientDAO.addClient(client);		
 	}
 
	@POST
	@Path("/GenerateQuote")	
	@Consumes({MediaType.APPLICATION_JSON})
	public boolean generateQuote(Quote quote) {
 		return quoteDAO.generateQuote(quote);		
 	}
	
}