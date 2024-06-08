package userm12;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteUser {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pooji");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		User dbUser=entityManager.find(User.class, 99);
		
		if(dbUser!=null) {
			entityTransaction.begin();
			entityManager.remove(dbUser);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry id is not present");
		}
	}
}
