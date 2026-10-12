package com.leonardoalves.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.leonardoalves.course.entities.Category;
import com.leonardoalves.course.entities.Order;
import com.leonardoalves.course.entities.User;
import com.leonardoalves.course.entities.enums.OrderStatus;
import com.leonardoalves.course.repositories.CategoryRepository;
import com.leonardoalves.course.repositories.OrderRepository;
import com.leonardoalves.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {

		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
		User u1 = new User(null, "Maria Brown" , "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green" , "alex@gmail.com", "955555555", "654321");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2014-08-09T14:17:36Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2017-12-13T19:03:45Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		userRepository.saveAll(Arrays.asList(u1,u2)); // Salvando no banco de dados após instanciar
		orderRepository.saveAll(Arrays.asList(o1,o2,o3)); // Salvando os pedidos
	}
	
}
