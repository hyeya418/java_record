package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
	public static void main(String[] args) {
		//우변 제너릭 타입 생략 가능
		List<Student> list = new ArrayList<>();
		//add()메소드내에서 생성자 활용
		list.add(new Student("2022001", "정호야", "컴공", 1, "김혜야"));
		list.add(new Student("2022002", "호냥이", "국사", 2, "김혜둥"));
		list.add(new Student("2022003", "호둥둥", "전산", 3, "혜둥둥"));
		System.out.println("학번\t이름\t전공\t학년\t지도교수");
		
		for(int i=0; i<list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"
			+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
			
		}
		//for-each문 사용
//		for(Student s : list) {
//			System.out.println(s.getNum()+"\t"+s.getName()+"\t"
//					+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
//		}
	}
}
