package in.ashokit.beans;

public class Car {

private Engine eng;

//public Car(Engine eng){
//	this.eng = eng;
//	System.out.println("Car constructor called...");
//}

public void setEng(Engine eng) {
	this.eng = eng;
}




public void drive() {
	boolean status = eng.start();
	
	if(status) {
		System.out.println("Car Started...");
	}else {
		System.out.println("Engine Trouble...");
	}

}




	
	
}
