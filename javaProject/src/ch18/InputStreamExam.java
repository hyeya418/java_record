package ch18;

import java.io.IOException;

/*
 스트림 : 데이터의 논리적인 통로
 1byte(8bit)단위로 처리
 -프로그램 기준-
 InputStream (입력 스트림)
 OutputStream(출력 스트림)
 입출력 프로그램은 try~catch문 안에서 작성 필수(네트워크, DB)
 */
public class InputStreamExam {
	public static void main(String[] args) {
		int var = 0;
		try {
			System.out.println("내용을 입력하세요 : ");
			//키보드로부터 1byte를 읽음,따라서 한글(2byte)처리가 안됨
			var = System.in.read();
			while(var != 13) { //엔터키를 입력하기 전까지 반복
				System.out.println(var+"==>"+(char)var);
				//모든 문자에는 고유한 숫자코드가 있다.
				//int형 var를 문자형 char로 형변환해서 출력
				var = System.in.read();
			}
		} catch (IOException e) { //입출력관련 예외처리
			e.printStackTrace();
		}
	}
}
