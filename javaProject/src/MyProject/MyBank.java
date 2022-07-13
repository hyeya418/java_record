package MyProject;

public class MyBank{
	public synchronized void DepositeA() {
		int money = 10;
		for(int i=0; i<5; i++) {
			System.out.println("홍길동님의 통장잔고는 "+money+" 만원입니다.");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			money+=10;
		}//for
	}//DepositeA()
	
	public synchronized void DepositeB() {
		for(int i=20; i<=60; i+=10) {
			System.out.println("사임당님의 통장잔고는 "+i+" 만원입니다.");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//for
	}//DepositeB()
	
	public synchronized void DepositeC() {
		for(int i=30; i<=70; i+=10) {
			System.out.println("이몽룡님의 통장잔고는 "+i+" 만원입니다.");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//for
	}//DepositeC()
	
}
