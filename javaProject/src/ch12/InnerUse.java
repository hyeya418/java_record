package ch12;

import ch11.Flyer;

public class InnerUse {
	public static void main(String[] args) {
		Flyer f = new Flyer() {
		//new 자료형(){ };=>익명클래스

			@Override
			public void takeOff() {
				System.out.println("take off");
			}

			@Override
			public void fly() {
				System.out.println("fly");
			}

			@Override
			public void land() {
				System.out.println("land");
			}
		};//익명클래스
		
		f.takeOff();
		f.fly();
		f.land();
	}//main
}
