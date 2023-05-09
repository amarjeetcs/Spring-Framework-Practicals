package com.spring.data.jpa;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.data.jpa.dao.UserRepository;
import com.spring.data.jpa.entity.User;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		UserRepository repo = context.getBean(UserRepository.class);

		// saving single row into table
		/*
		 * User user=new User(); user.setId(100);
		 * 
		 * user.setName("Mr Rudrendra"); user.setCity("Siwan");
		 * user.setStatus("I am Python Developer"); User user1=repo.save(user);
		 * System.out.println(user);
		 */

		// inserting multiple row into database User user1 = new User();

		/*
		 * User user1 = new User(); user1.setId(100); user1.setName("Rajnish");
		 * user1.setCity("Bihar"); user1.setStatus("Java Developer");
		 * 
		 * User user2 = new User(); user2.setId(101); user2.setName("Amarjeet");
		 * user2.setCity("Bihar"); user2.setStatus("Java Developer");
		 * 
		 * List<User> users = List.of(user1, user2); Iterable<User> result =
		 * repo.saveAll(users); result.forEach(user -> { System.out.println(user); });
		 */

		/*
		 * //update the record into database Optional<User> optional=repo.findById(52);
		 * User user=optional.get(); user.setName("Hira Singh"); User
		 * result=repo.save(user); System.out.println(result);
		 */

		/*
		 * //featch multiple record Iterable<User> itr=repo.findAll(); Iterator<User>
		 * iterator=itr.iterator(); while(iterator.hasNext()) { User
		 * user=iterator.next(); System.out.println(user); }
		 */

		/*
		 * //another way to find all the record from table using java 8 Iterable<User>
		 * itr=repo.findAll(); itr.forEach(user->{ System.out.println(user); });
		 * 
		 */

		/*
		 * repo.deleteById(52); System.out.println("Deleted...");
		 */

		/*
		 * //delete multiple records Iterable<User> allusers = repo.findAll();
		 * System.out.println(); allusers.forEach(user -> System.out.println(user));
		 * repo.deleteAll(allusers); System.out.println("all deleted...");
		 */

		/*//custom finder method
		 * List<User> findByName = repo.findByName("Amarjeet"); findByName.forEach(e ->
		 * System.out.println(e));
		 */
		
		/*//custom finder method
		 * List<User> findByNameAndCity = repo.findByNameAndCity("Amarjeet", "Bihar");
		 * findByNameAndCity.forEach(e -> System.out.println(e));
		 */
		
	}

}
