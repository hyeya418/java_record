package MyProject;

public class MyThreadEx2 implements Runnable{
	String str;
	public MyThreadEx2(String str) {//스레드 이름
		this.str=str;
	}
	public MyThreadEx2() {//기본 생성자
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
