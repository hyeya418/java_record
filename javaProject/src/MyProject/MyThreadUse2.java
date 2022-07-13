package MyProject;

public class MyThreadUse2 {
	public static void main(String[] args) {
		MyThreadEx2 r1 = new MyThreadEx2("스레드1**");
		MyThreadEx2 r2 = new MyThreadEx2("스레드2++");
		MyThreadEx2 r3 = new MyThreadEx2("스레드3##");
		
		//Runnable을 구현했을 때는 Thread를 별도로 생성해서 써야 한다.
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.setPriority(Thread.MAX_PRIORITY); //우선순위10
		t3.setPriority(Thread.MIN_PRIORITY); //우선순위1
		
		System.out.println("-----------");
		t1.start();
		t2.start();
		t3.start();
	}
}
