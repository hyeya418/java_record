package ch08;

public class PersonUse {

	public static void main(String[] args) {
		Person p1 = new Person(); //객체 생성과 동시에 기본 생성자 호출
		System.out.println(p1); //각 객체는 각각 다른 주소값에 생성된다. 
		p1.showInfo();
		
		Person p2 = new Person("김상범"); //객체 생성과 동시에 매개변수가 1개인 생성자 호출
		System.out.println(p2); //각 객체는 각각 다른 주소값에 생성된다
		p2.showInfo();
	
		Person p3 = new Person("박찬호",185); //객체 생성과 동시에 매개변수가 2개인 생성자 호출
		p3.showInfo();
		
		Person p4 = new Person("박지성", 175,72);//객체 생성과 동시에 매개변수가 3개인 생성자 호출
		p4.showInfo();
	}

}
