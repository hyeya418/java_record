package ch08;

public class Person {
	//멤버변수
	private String name;
	private int height;
	private int weight;
	
	public Person() {//기본 생성자
		this("고길동",170,60); //this()생성자 호출은 첫줄에 써야 함.
	}
	
	public Person(String name) { //매개변수가 1개인 생성자
		this(name,190,100);//나와 이름이 같은 Person생성자 중
						   //매개변수 개수와 타입이 맞는 생성자를 호출
	}
	
	public Person(String name, int height) {//매개변수가 2개인 생성자
		this(name,height,70); 
	
	}
	
	public Person(String name, int height, int weight) { //매개변수가 3개인 생성자
		this.name = name; //지역변수로 들어온 값을 멤버변수에 저장함
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println("=== 신상 정보 ===");
		System.out.println("이름 : "+name);
		System.out.println("신장 : "+height);
		System.out.println("체중 : "+weight);
	}
}

