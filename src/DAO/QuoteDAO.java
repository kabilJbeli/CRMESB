package DAO;

import connection.connexion;
import entities.Quote;

public class QuoteDAO implements IQuote {

	@Override
	public boolean generateQuote(Quote quote) {
		// TODO Auto-generated method stub
		connexion.getEntityManager().getTransaction().begin();
		connexion.getEntityManager().persist(quote);		
		connexion.getEntityManager().getTransaction().commit();
		if(getQuoteByID(quote.getIdquote()) != null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Quote getQuoteByID(int id) {
		// TODO Auto-generated method stub
		Quote quote = null;
		connexion.getEntityManager().getTransaction().begin();
		quote = connexion.getEntityManager().find(Quote.class,id);		
		connexion.getEntityManager().getTransaction().commit();
		return quote;
	}

}
