package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		int gamescore =150;
		
		int lastscore = ++gamescore; // 151 을 LValue 에 대입
		int finalscore = gamescore++; // 151 을 대입하고 gamescore 1 추가
		int score = gamescore; // 151
		System.out.println(lastscore);//151
		System.out.println(finalscore);//151
		System.out.println(score);//152
		
		
	}

}
