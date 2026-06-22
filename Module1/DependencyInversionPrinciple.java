package kowshik;
interface MessageService {
    void sendMessage();
}
class EmailService implements MessageService {

    public void sendMessage() {
        System.out.println("Email sent");
    }
}
class SMSService implements MessageService {

    public void sendMessage() {
        System.out.println("SMS sent");
    }
}
class Notification {

    MessageService service;

    Notification(MessageService service) {
        this.service = service;
    }

    void notifyUser() {
        service.sendMessage();
    }
}
public class DependencyInversionPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MessageService email = new EmailService();
	        Notification n1 = new Notification(email);
	        n1.notifyUser();

	        MessageService sms = new SMSService();
	        Notification n2 = new Notification(sms);
	        n2.notifyUser();
	}

}
