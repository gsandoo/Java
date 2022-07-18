package ch06;

public class ThreedPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		
		ThreedPrinter printer = new ThreedPrinter();
		
		printer.setMaterial(powder);
		
		Powder p = (Powder) printer.getMaterial();
	}

}
