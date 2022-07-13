package MyProject;

public class MemberOuter {
	private int num = 1;
	private String name = "홍길동";
	private String email = "hong@gmail.com";
	
	class TestInner{
		public void print() {
			System.out.println("----------------------");
			System.out.println("고객번호 : " + num);
			System.out.println("이름: " + name);
			System.out.println("이메일 : " + email);
			System.out.println("----------------------");

		}
	}

	
	public static void main(String[] args) {
		MemberOuter mem = new MemberOuter();
		MemberOuter.TestInner in = mem.new TestInner();
		
		in.print();
	}
}
