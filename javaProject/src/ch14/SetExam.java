package ch14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		//Set은 순서X, 데이터 중복 허용X
		hs.add("korea");
		hs.add("japan");
		hs.add("america");
		hs.add("britain");
		hs.add("korea");
		System.out.println(hs);
		for(String str : hs) {
			System.out.println(str);
		}
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {//hasNext()가 다음요소가 있는지 확인
			System.out.println(it.next());//다음요소를 읽어 옴
		}
	}

}
