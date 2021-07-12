package com.practiceMV.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practiceMV.springboot.entity.User;
import com.practiceMV.springboot.repository.UserRepository;

@SpringBootApplication
public class PracticeModelView1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PracticeModelView1Application.class, args);
		System.out.println("Hello this is REST practice");
	}
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User user =User.builder()
				.firstName("Oshadi")
				.lastName("Godage")
				.email("oshadigodage@gmail.com").
				build();
		userRepository.save(user);
	}

}
