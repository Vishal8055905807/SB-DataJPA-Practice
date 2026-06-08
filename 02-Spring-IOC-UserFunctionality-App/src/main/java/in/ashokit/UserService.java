package in.ashokit;

public class UserService {
	
	public IPwdService pwdService;

	public IEmailService emailService;
	
	public UserService(IPwdService pwdService,IEmailService emailService ) {
		this.pwdService = pwdService;
		this.emailService = emailService;
	}
	
	
	
	public void register(String name, String email, Long phno) {
		
		String password = pwdService.generatePassword();
		
		String subject = "Accout created";
		String body = "Your login pwd is "+ password;
		
		boolean sendEmail = emailService.sendEmail(subject, body, email);
		
		if(sendEmail) {
			System.out.println("Account created");
			
		}else {
			System.out.println("Failed to create account");
		}

	}
	
}
