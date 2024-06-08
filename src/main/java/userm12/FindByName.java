package userm12;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FindByName {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pooji");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
    Query query=entityManager.createQuery("select u from User u where u.name=?1");
	query.setParameter(1, "Mahalakshmii");
	
//	im having a result in 14 th line
//	User dbUser=(User) query.getSingleResult();
//	System.out.println(dbUser);
	List<User> list=query.getResultList();
	System.out.println(list);
}
}
