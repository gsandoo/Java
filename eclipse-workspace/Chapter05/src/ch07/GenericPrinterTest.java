package ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		
		powder.doPrint();
		
		GenericPrinter<Powder> printer = new GenericPrinter<>();
		
		printer.setMaterial(powder);
		
		Powder p = printer.getMaterial();
		
		System.out.println(p);
		
		System.out.println("=================");
		

		Plastic plastic = new Plastic();
		
		plastic.doPrint();
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();

				
		plasticPrinter.setMaterial(plastic);
		
		Plastic plastic2 = plasticPrinter.getMaterial();
		
		System.out.println(plastic2);
	}

}
