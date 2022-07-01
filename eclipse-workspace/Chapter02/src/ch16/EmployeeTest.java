package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("김창식");
		System.out.println(employeeLee.getSerialNum());
	
		Employee employeeKim = new Employee();
	
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeID() + " 번 입니다");
		System.out.println(employeeKim.getEmployeeID());
	}

}
