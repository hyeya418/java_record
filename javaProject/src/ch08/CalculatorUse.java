package ch08;

public class CalculatorUse {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(); //객체 생성과 동시에 기본 생성자 호출
		System.out.println(c1);
		//입력
		c1.setLeft(10);
		c1.setRight(20);
		//출력
		System.out.println(c1.getLeft());
		System.out.println(c1.getRight());
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(10, 20); //매개변수가 있는 생성자를 호출
		System.out.println(c2);
		c2.sum();
		c2.avg();
		
		Calculator c3 = new Calculator(30,40); //매개변수가 있는 생성자를 호출
		System.out.println(c3);
		c3.sum();
		c3.avg();
	}

}