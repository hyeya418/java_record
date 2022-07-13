package MyProject;

public class MemberUse {

	public static void main(String[] args) {
		Member m = new Member("홍길동", "hong", 120000);
		//객체 생성과 동시에 매개변수가 3개인 생성자 호출
		m.showInfo();
		
	}

}
