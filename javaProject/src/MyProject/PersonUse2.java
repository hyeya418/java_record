package MyProject;

public class PersonUse2 {

	public static void main(String[] args) {
		Person p1 = new Person();//객체 생성(인스턴스화)
		//참조변수.멤버
		p1.setName("홍길동"); 
		p1.setAge(30);
		p1.setEmail("hong@naver.com");
		p1.setAddress("서울 강남구 역삼동");
		
		p1.print();
		System.out.println();
		
		Person p2 = new Person();//객체 생성(인스턴스화)
		//참조변수.멤버
		p2.setName("사임당");
		p2.setAge(23);
		p2.setEmail("saimdang@daum.net");
		p2.setAddress("서울 강남구 개포동");
		
		p2.print();
	}

}
