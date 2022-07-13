package ch14;

public class Type1 {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		Type1 t = new Type1();
		t.setValue(100);
//		t.setValue(100.5);  //변경해야 할 것이 많음
//		t.setValue("hello");//변경해야 할 것이 많음
		System.out.println(t.getValue());
		
	}
	
}	
