package spring.concepts.dependencyinjection;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SMS_Service implements MessageService{
	
	@Override
	public void sendMessage(String message) {
		
		System.out.println(message + "in SMS_Service Class");
	}

}
