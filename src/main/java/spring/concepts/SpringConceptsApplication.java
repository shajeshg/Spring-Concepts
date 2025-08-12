package spring.concepts;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.concepts.dependencyinjection.APPConfig;
import spring.concepts.dependencyinjection.Message_Sender;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringConceptsApplication.class, args);
		

		/* Dependency Injection Concepts */
		String message = "Welcome to the world of Spring Concepts";
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(APPConfig.class);
		Message_Sender message_Sender = applicationContext.getBean(Message_Sender.class);
		message_Sender.sendMessage(message);
		applicationContext.close();
	}

}
