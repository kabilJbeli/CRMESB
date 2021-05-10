package repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Client;
public class CrmRepository {

	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		if(entityManager==null) {
			 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("crmREST");
			 entityManager =entityManagerFactory.createEntityManager();
		}
		return entityManager;
	}
	
	public  void subscribeClient(Client client) {
		getEntityManager().getTransaction().begin();
		getEntityManager().persist(client);		
		getEntityManager().getTransaction().commit();
	}
		
}
