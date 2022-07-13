package MyProject;

import java.util.Scanner;

public class RectangelTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int width, height;
		double area;
		
		System.out.println("==============================");
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		width = input.nextInt();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		height = input.nextInt();
		
		area = width * height;
		System.out.println("직사각형의 넓이는 " + area + "입니다.");
		System.out.println("==============================");

		input.close();//스캐너 객체 닫기
}

}