package in.ashokit;

public class Atm {

	public IPrinter printer;
	
	public Atm() {
		System.out.println("No param Atm constructor");
	}
	
	public Atm(IPrinter print) {
		this.printer = print;
		System.out.println("Param Atm constructor");
	}
	
	public void setPrinter(IPrinter print) {
		this.printer = print;
		

	}
	
	public void withdraw() {
		System.out.println("Withdrawl succesfull...");
		printer.print();
		
	}
	
	
}
