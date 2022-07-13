package MyProject;

public class MyThreadEx1 extends Thread {
	public MyThreadEx1(String name) {//스레드이름
		super(name);
	}
	public MyThreadEx1() {//기본 생성자 
	}
	
	@Override
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
