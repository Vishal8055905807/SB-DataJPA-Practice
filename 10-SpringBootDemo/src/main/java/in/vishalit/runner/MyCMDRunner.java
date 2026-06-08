package in.vishalit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component 
public class MyCMDRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ComandLineRunner run() method called");
		
	}


	
	
	
}
