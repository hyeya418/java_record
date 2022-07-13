package ch16;
/*
 멀티스레드 : 작업단위가 2개 이상
 구현 방법1 : Thread(클래스) 상속
 구현 방법2 : Runnable(인터페이스)을 구현 
 */

public class ThreadExam extends Thread{ 
	public ThreadExam() {} //기본생성자
	public ThreadExam(String name) {
		super(name);//부모클래스 생성자 호출
	}
	@Override
	public void run() { 
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000); //해당메서드는 필수로 try-catch문 입력
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//1초 멈춤
		}
	}
	
	
	public static void main(String[] args) {
		ThreadExam e1 = new ThreadExam("thread1");
		ThreadExam e2 = new ThreadExam("thread2");
		ThreadExam e3 = new ThreadExam("thread3");
		
//		e1.run(); run()메서드를 직접 쓰면 안된다.
		e1.start(); //스레드객체.start() ==> run()이 자동 호출 됨
		e2.start();	//위와 동시에 호출
		e3.start(); //위와 동시에 호출
		
	}
}
