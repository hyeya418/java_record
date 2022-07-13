package ch10;

class Triangle extends Figure{
//메소드이름 Ctrl + SpaceBar 단축키로 오버라이딩 가능
		@Override
		void draw() {
			System.out.println("삼각형 그리기...");
		}
}

class Rectangle extends Figure {
	@Override
	void draw() {
		System.out.println("사각형 그리기...");
	}
}

class Circle extends Figure {
	void draw() {
		System.out.println("원 그리기...");
	}

	}

public class Figure {
	void draw() {
		System.out.println("도형을 그립니다.");
	}
	
	public static void main(String[] args) {
		//좌변과 우변의 클래스이름이 같다.
		Triangle t = new Triangle();
		t.draw();
		
		Rectangle r = new Rectangle();
		r.draw();
		
		Circle c  = new Circle();
		c.draw();
		
		System.out.println("=====================");
		//**다형성**(중요) 
		Figure f = new Triangle(); //좌변은 부모, 우변은 자식클래스(다형성)
		f.draw();
		f = new Rectangle();
		f.draw();
		f=new Circle();
		f.draw();
		
		
	}
}
