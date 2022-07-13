package MyProject;

public class Car {

		//멤버 변수
	 String color; //색상
	 int speed; //속도
	 int gear; //기어
		
	 	void changeColor(String c) {
	 		color = c;
	 	}
	 
		void changeGear(int g) {
			gear = g;
		}
		
		void changeSpeed(int s) {
			speed = s;
		}
		
		void speedUp() {
			speed = speed +10;
		}
		
		void speedDown () {
			speed = speed - 10;
		}
	}




