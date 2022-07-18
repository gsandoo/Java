package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		
		GenericPrinter<Powder> printer = new GenericPrinter<>();
		
		printer.setMaterial(powder);
		
		Powder p = printer.getMaterial();
		
		System.out.println(p);
	}

}
