package jpabook.jpabookex2;

import jpabook.jpabookex2.registration.CreateRegistration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Jpabookex2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Jpabookex2Application.class, args);
		CreateRegistration createRegistration = context.getBean(CreateRegistration.class);
		createRegistration.create();
	}

}
