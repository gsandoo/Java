package ch17;

public class LeastJob implements Scheduler {

	@Override
	public void getNextcall() {
		System.out.println("대기적은 상담원에게 배분됩니다.");		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음상담원에게 배분됩니다.");
	}

}
