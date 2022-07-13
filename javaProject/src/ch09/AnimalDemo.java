package ch09;

class Animal { //부모클래스
	
	public Animal(String s) { //매개변수가 1개인 생성자
		System.out.println("동물 : " +s);
	}
}

class Mammal extends Animal { //자식클래스
	
	public Mammal() { //기본 생성자
		super("원숭이"); //부모 클래스 생성자 호출
		System.out.println("포유류 : 원숭이");
	}
	
	public Mammal(String s) {//매개변수가 1개인 생성자
		//생성자의 첫줄에 반드시 생성자를 호출해야 한다.
		super(s); //super()=>부모클래스 생성자 호출
				  //this() =>이름이 같은 생성자 호출(같은 클래스)
		System.out.println("포유류 : " +s);
	}
}

public class AnimalDemo {
	public static void main(String[] args) {
		Mammal ape = new Mammal(); //객체생성 및 기본생성자 호출
		System.out.println(ape);//객체가 생성된 주소
		
		Mammal lion = new Mammal("사자"); //객체생성 및 매개변수가 있는 생성자 호출
		System.out.println(lion);//객체가 생성된 주소
	}

}
