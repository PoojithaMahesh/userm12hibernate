package userm12;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateUser {
public static void main(String[] args) {
	User user=new User();
	user.setName("MahalakshmiiJM");
	user.setAddress("MYSURU");
	
	UpdateUser updateUser=new UpdateUser();
	updateUser.updateUser(20, user);
}
public void updateUser(int userId,User user) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pooji");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	User dbUser=entityManager.find(User.class, userId);
	if(dbUser!=null) {
//		id is present
//		call merge method what it is going to do??
//		it will update the data
//		call merge
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		user.setId(userId);
		entityManager.merge(user);
		entityTransaction.commit();
	}else {
//		id is not present
//		call merge method what it is going to do ??
//		insert the data
		System.out.println("Sorry id is not present to update the data");
	}
}







}
