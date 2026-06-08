package in.ashokit;

public class PwdServiceImpl implements IPwdService {

	@Override
	public String generatePassword() {
		System.out.println("Random password generated");
		return "AV564VS26";
	}
	

}
