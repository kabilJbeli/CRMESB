package connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class connexion {
	private static EntityManager entityManager;
	public static EntityManager getEntityManager() {
		if(entityManager==null) {
			 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("crmREST");
			 entityManager =entityManagerFactory.createEntityManager();
		}
		return entityManager;
	}	
}
