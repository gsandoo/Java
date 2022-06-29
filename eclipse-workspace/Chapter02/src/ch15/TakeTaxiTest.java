package ch15;

public class TakeTaxiTest {

	public static void main(String[] args) {

		Student student = new Student("Edward" , 20000);
		Taxi taxi = new Taxi("잘나간다 운수");
		
		student.takeTaxi(taxi);
		
		student.showInfo();
		taxi.showTaxiInfo();
	}

}
