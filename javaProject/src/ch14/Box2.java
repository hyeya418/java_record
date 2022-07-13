package ch14;
//지네릭스(제너릭)활용
public class Box2<T> { //<T>는 타입매개변수
	private T data; //데이터타입이 T인 멤버변수data
	public void set(T data) {
		this.data = data;
	}
	public T get() {
		return data;
	}
	
	public static void main(String[] args) {
		Box2<String> b = new Box2<String>(); 
		//<T>(타입매개변수)에 대입하게 될 String을 지정
		b.set("긔염 호둥둥은");
		
		String s = b.get();
		
		Box2<Integer> c = new Box2<Integer>();
		c.set(1004);

		Integer i = c.get();
		
		System.out.println(s);
		System.out.println(i);
	}

}
