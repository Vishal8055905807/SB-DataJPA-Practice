package in.ashokit;

public class EmailServiceImpl implements IEmailService {

	@Override
	public boolean sendEmail(String subject, String body, String to) {
		System.out.println("Email sent..");
		
		return true;
		

	}

}
