package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;

//입력값을 파일로 출력(Write)함 

public class FileWrite {
	public static void main(String[] args) {
		//프로그램 입장 ==> 파일(아웃풋스트림)
		//파일 ==> 프로그램(인풋스트림)
		OutputStream os = null;
		try {
			os = new FileOutputStream("c:\\test\\aa.txt");
			//""안에서 \를 표현할 때는 \\두개를 써야 함
			System.out.println("입력하세요 : ");
			while(true) {
				int ch = System.in.read(); //1byte 읽어 옴
				if(ch==13) break;//엔터키(13)을 만나면 종료
				os.write(ch);    //파일에 입력된 값이 저장
			}
			System.out.println("저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
