package userm12;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindUser {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pooji");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
//	ENTITY transaction is neccessary only for the crud operation performing from
//	java to database
//	it is not neccessary while performing an operation from database to java
	User dbUser=entityManager.find(User.class, 100);
	if(dbUser!=null) {
//		id is present
		System.out.println(dbUser);
	}else {
		System.out.println("Sorry Id is not present");
	}
}
}
