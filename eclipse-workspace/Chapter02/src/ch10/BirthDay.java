package ch10;

public class BirthDay {
	
	private int day;
	private int month ;
	private int year ;
	
	private boolean isValid ;
	
	public int getDay() {
		return day;
	}
	
	public void setDay( int day) {
		
		this.day = day ;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
		}else {
			isValid = !isValid;
			this.month = month;
		}
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showBirthDay() {
		if(isValid) {
			System.out.println(year + "년" + month + "월" + day + "에 태어나셨습니다" );	
		}else {
			System.out.println("유효하지 않은 생일입니다.");
		}
	}
}
