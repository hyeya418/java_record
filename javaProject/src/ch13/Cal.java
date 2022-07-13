package ch13;

import java.util.Calendar;
import java.util.Date;

public class Cal {
	public static void main(String[] args) {
		//Calendar는 추상클래스이므로 new로 객체 생성불가
		Calendar cal = Calendar.getInstance();
		
		//년도
		System.out.println(cal.get(Calendar.YEAR));
		//월은 0부터 시작함 (0~11)
		System.out.println(cal.get(Calendar.MONTH)+1);
		//일
		System.out.println(cal.get(Calendar.DATE));
		//시(12시간제)
		System.out.println(cal.get(Calendar.HOUR));
		//시(24시간제)
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		//분
		System.out.println(cal.get(Calendar.MINUTE));
		//초
		System.out.println(cal.get(Calendar.SECOND));
		
		//오전0, 오후1
		System.out.println(cal.get(Calendar.AM_PM));
		if(cal.get(Calendar.AM_PM)==0) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
					}
		//1년 중 몇번째 날
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		//월의 몇번째 날
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		//요일(일요일:1,토요일7) - Java에서는 숫자코드까지만 제공해준다.
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		String yoil="";
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1: yoil = "일요일"; break;
		case 2: yoil = "월요일"; break;
		case 3: yoil = "화요일"; break;
		case 4: yoil = "수요일"; break;
		case 5: yoil = "목요일"; break;
		case 6: yoil = "금요일"; break;
		case 7: yoil = "토요일"; break;
		}
		System.out.println("오늘은 "+yoil+"입니다.");
		
		//1년 중 몇번째 주
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		
		Date date = cal.getTime();
		//"deprecated method":에러는 아니지만 가급적이면 쓰지 말라는 뜻(old)
		//웹에서는 사용한다.
		System.out.println(date.getYear()+1900); //1900을 더함..
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDate()+1);
		
		
	}
}
