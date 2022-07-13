package ch11;

public class AutoCarUSe {
	public static void main(String[] args) {
		//다형성 
		OperateCar obj = new AutoCar();
		obj.start();
		obj.setSpeed(90);
		obj.turn(15);
		obj.stop();
	}

}
