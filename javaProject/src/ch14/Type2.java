package ch14;

public class Type2 {
	private Object value; //데이터타입 상관없이 메서드 사용 가능.

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		Type2 t = new Type2();
		t.setValue("Kim");
		System.out.println(t.getValue());
		
		t.setValue(10);
		System.out.println(t.getValue());
		//Object로 모든걸 처리하게 되면
		//내부적으로 형변환 등의 처리가 많아진다.
	}
	
}
