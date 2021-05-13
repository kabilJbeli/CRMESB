package DAO;

import connection.connexion;
import entities.Client;

public class ClientDAO implements IClient {

	@Override
	public boolean addClient(Client client) {
		// TODO Auto-generated method stub		
		connexion.getEntityManager().getTransaction().begin();
		connexion.getEntityManager().persist(client);		
		connexion.getEntityManager().getTransaction().commit();
		if(getClientByID(client.getIdclient()) != null) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public Client getClientByID(int id) {
		// TODO Auto-generated method stub
		Client client = null;
		connexion.getEntityManager().getTransaction().begin();
		client = connexion.getEntityManager().find(Client.class,id);		
		connexion.getEntityManager().getTransaction().commit();
		return client;
	}

}
