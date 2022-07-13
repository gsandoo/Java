package ch17;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextcall() {
		System.out.println(" 모든 상담원이 동일한 상담 건수를 처리하도록 상담원 순서대로 배분합니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		
		System.out.println("다음순서의 상담원에게 배분합니다.");
	}
	
	
	
}
