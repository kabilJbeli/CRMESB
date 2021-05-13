package DAO;

import entities.Quote;

public interface IQuote {
	public boolean generateQuote(Quote quote);
	public Quote getQuoteByID(int id);
}
