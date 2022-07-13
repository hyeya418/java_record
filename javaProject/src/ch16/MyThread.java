package ch16;

public class MyThread extends Thread{
	public MyThread() { //기본생성자 만드는 습관 들이기
	}
	
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("run메소드 실행");
			try {
				Thread.sleep(1000);//cpu 1초 잠재우기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
