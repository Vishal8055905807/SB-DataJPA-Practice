package in.ashokit;

public class HpPrinter implements IPrinter {

	public HpPrinter() {
		System.out.println("HP constructor");
	}
	
	@Override
	public void print() {
		System.out.println("Hp printer printing...");
	}

}
