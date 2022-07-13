package MyProject;

public class MyThreadUse1 {
	public static void main(String[] args) {
		MyThreadEx1 t1 = new MyThreadEx1("스레드1**");
		MyThreadEx1 t2 = new MyThreadEx1("스레드2++");
		MyThreadEx1 t3 = new MyThreadEx1("스레드3##");
		
		t1.setPriority(Thread.MAX_PRIORITY); //우선순위10
		t3.setPriority(Thread.MIN_PRIORITY); //우선순위 1
		
		System.out.println("-----------");
		t1.start();
		t2.start();
		t3.start();
	}
}
