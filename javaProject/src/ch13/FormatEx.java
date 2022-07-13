package ch13;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatEx {
	public static void main(String[] args) {
		int val = 123400000;
		//3자리수 콤마 표시
		//1) String을 활용
		String str = String.format("%,d", val);
		System.out.println(str);
		
		
		//2) DecimalFormat을 활용
		DecimalFormat df = new DecimalFormat("###,###.##");
		String num = df.format(123000000.323232);
		System.out.println(num);
		
		//3)NumberFormat을 활용
		NumberFormat nf = NumberFormat.getInstance();
		String num2 = nf.format(1230000.1234);
		System.out.println(num2);
		
		//4)getInstance(Locale.국가):해당국가 표기법, 기본은 Locale.US이다.
		NumberFormat nf2 = NumberFormat.getInstance(Locale.ITALY);
		String num3 = nf2.format(1230000.1234);
		System.out.println(num3);
		
	}

}
