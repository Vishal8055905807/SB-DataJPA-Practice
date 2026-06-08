package in.ashokit;

public class Bike {
	
Engine eng;	

public Bike(Engine eng) {
	this.eng = eng;
	System.out.println("Bike Constructorr called");
}

public void run() {
	eng.start();
	System.out.println("Bike is running");

}
}

