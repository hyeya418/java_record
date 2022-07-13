package ch06;

public class ReturnEx2 {
	public static void main(String[] args) {
		printScore(101);
	}

	public static void printScore(int score) {
		if(score <= 0 || score >= 100) {
			System.out.println("잘못된 점수 : " + score);
			return; //return이 있는 자리가 메소드 종료 자리이다(중요)
			        //조건문에서는 생략하면 메소드 종료 시점이 달라지므로 주의.
		}//if문
		
		System.out.println("점수 : " + score);
		
	} //메소드
	
}
