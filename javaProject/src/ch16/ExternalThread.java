package ch16;

public class ExternalThread {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("thread1");
		MyThread t2 = new MyThread("thread2");
		MyThread t3 = new MyThread("thread3");
		t1.start(); //run()메소드 호출
		t2.start();
		t3.start();
		//thread1,2,3이 한번에 실행되는중
	}

}
