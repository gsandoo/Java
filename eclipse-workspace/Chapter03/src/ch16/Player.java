package ch16;

public class Player {

	PlayerLevel level;
	// main 보드에서 level 정의 하니까 level 에 맞는 클래스를 돌려야 하기 때문
	
	
	
	
	public PlayerLevel getLevel() {
		return level;
	} 
	
	public void upgradeLevel(PlayerLevel level) {
		// Player 클래스의 level은 main 보드에서 정의해준
		// 레벨이다.
		this.level=level;
		level.showLevelMessage();
	}
	

	public void play(int count) {
	
		level.go(count);
	}


	
		
		
		
	


	
}
