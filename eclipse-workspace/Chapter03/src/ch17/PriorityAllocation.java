package ch17;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextcall() {
		System.out.println("vip 고객님을 모시든 상담원이 배정됩니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 상담원에게 배정됩니다.");
	}

}
