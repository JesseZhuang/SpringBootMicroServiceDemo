package io.bittigerX;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SpringBootUserServiceApplication {

	@Bean // the command line runner is executed on start of the application
	CommandLineRunner  clr (UserEntityRepo userEntityRepo){
		// Java 8 lambda expression, reactive java programming
		return args -> {
            // create 4 users and save them to database
			Stream.of("ross", "little shitou", "jerry", "jesse").forEach(name ->
                    userEntityRepo.save(new UserEntity(name)));
            userEntityRepo.findAll().forEach(System.out::println);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUserServiceApplication.class, args);
	}
}
