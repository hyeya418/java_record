package ch09;

public class Volume extends Area { //Area의 자손클래스
	//멤버변수
	private int height;
	
	//기본생성자 생성하는 습관 들이기
	public Volume() {}
	
	public Volume(int width, int length, int height) {
		super(width,length); //부모클래스의 생성자 호출
		this.height = height; 
	}
	
	public int getVolume() {
		return getArea()*height;
	}
}
