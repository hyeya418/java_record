package ch08;

//싱글톤 기법
public class MyManager {
	private int score;//10 -> 100
	
	//싱글톤 처리된 생성자는 
	
	private MyManager(int score) { //매개변수가 1개인 싱글톤 생성자
		this.score=score;
	}
	//private static 클래스이름 참조변수;의 형태
	private static MyManager mgr; //static변수
	
	//public static 클래스이름 메소드이름()의 형태
	public static MyManager getInstance() {//메소드,, MyManager = 리턴타입
		if(mgr==null) {//처음 MyManager가 객체화 될 때, 참조형의 주소값이 null이면
			mgr =new MyManager(10);
		}
		return mgr; //한번이상 객체 생성이 되었다면(즉, 주소값이 있으면)그 주소값을 리턴
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
		
	}
}