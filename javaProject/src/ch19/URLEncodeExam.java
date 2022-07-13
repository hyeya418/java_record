package ch19;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncodeExam {
/*
url에는 한글, 특수문자가 포함될 수 없음
ex) https://www.naver.com/
url encoding(인코딩) ==> 한글, 특수문자를 url 형식으로 변환시킴
url decoding(디코딩) ==> 인코딩된 문자열을 처음 내용으로 복원시킴
 */
	public static void main(String[] args) {
		try {
			String str="김길동";
			//URLEncoder.encode(인코딩할 문자열, "인코딩 형식")
			System.out.println(URLEncoder.encode(str, "utf-8"));//변조화
			System.out.println
			//URLDecoder.decode(디코딩할 문자열, "디코딩 형식")
			(URLDecoder.decode("%EA%B9%80%EA%B8%B8%EB%8F%99", "utf-8"));//복호화
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
