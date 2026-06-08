package in.ashokit;

public class SonyPrinter implements IPrinter {
	
	public SonyPrinter() {
		System.out.println("Sony consturctor");
	}

	@Override
	public void print() {
		System.out.println("Sony Printer printing...");
	}

}
