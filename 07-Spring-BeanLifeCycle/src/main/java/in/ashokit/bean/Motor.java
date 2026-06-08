package in.ashokit.bean;



import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class Motor {

	
public Motor() {
	System.out.println("Motor Constructor");
}

@PostConstruct
private void start() {
	System.out.println("Motar started..");

}

@PreDestroy
private void stop() {
	System.out.println("Motar stop..");

}
	
}
