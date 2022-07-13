package ch14;

public class Box {
	private Object data; //Object타입의 멤버변수 data
	
	public void set(Object data) {//지역변수 data
		this.data = data;
	}
	public Object get() { //리턴타입이 Object
		return data;
	}
	public static void main(String[] args) {
		Box b = new Box(); //Box클래스의 객체 생성
		b.set("Hello World"); //문자열 가능->사실 Object이므로 모든 타입 가능
		String s = (String)b.get();//String타입에 Object타입을 대입하고 싶음->형변환 해야 함 
		
		Box c = new Box();
		c.set(30); //Object타입이므로 모든 타입 가능
		Integer i = (Integer)c.get();//형변환으로 양쪽 타입 맞춰야 함.

		System.out.println(s);
		System.out.println(i);
	}
}

//Object타입 사용시 코드가 길어지면 메모리 과부하가 올 수 있음! ->제너릭 응용
