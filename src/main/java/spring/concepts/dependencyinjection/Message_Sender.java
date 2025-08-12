package spring.concepts.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Message_Sender {
	
	
	private MessageService messageService;

	@Autowired
	public void setMessageService(@Qualifier("smsService") MessageService messageService) {
		this.messageService = messageService;
		
		System.out.println("Setter Based Dependecny Injection");
	}
	
	public void sendMessage(String message) {
		this.messageService.sendMessage(message);
	}
	

}
