package ch16;

public class Employee {
	
	private static int serialNum = 1000;
	
	private int employeeID;
	private String employeeName;
	private String department;
	
	// 생성자 생성
	public Employee() {
		serialNum++;
		employeeID = serialNum; // id 에 시리얼 넘버대입
	}
	
	
	
	
	public static int getSerialNum() {
		return serialNum;
	}


	//get 은 그냥 리턴
	public int getEmployeeID() {
		return employeeID;
	}
	// set 은 변경 값 리턴
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
