package spring.concepts.dependencyinjection;

import org.springframework.stereotype.Component;

@Component("emailService")
public class Email_Service implements MessageService{

	@Override
	public void sendMessage(String message) {
		System.out.println(message + " In Email_Service Class");
		
	}

}
