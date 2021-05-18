package kr.java.chapter3;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(gameScore + ", " + lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println(gameScore + ", " + lastScore2);
		
		// ----
		lastScore1 = gameScore++;
		System.out.println(gameScore + ", " + lastScore1);
		
		lastScore2 = gameScore--;
		System.out.println(gameScore + ", " + lastScore2);
	}

}
