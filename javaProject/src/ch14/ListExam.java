package ch14;

import java.util.ArrayList;
import java.util.List;

//ArrayList : Vector와 사용법이 비슷하지만 더 가볍고 속도가 빠르다.

public class ListExam {
	public static void main(String[] args) {
//		ArrayList<Object> list = new ArrayList<>();
		//실무에서는 위와 달리 다형성을 활용하여 처리함 (좌변:조상, 우변:자손)
		List<Object> list = new ArrayList<>();
		list.add("하나");
		list.add(2);
		list.add(5.5);
		list.add(false);
		list.remove(0);
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}
}
