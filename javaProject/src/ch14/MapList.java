package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
	static void print(Map map) { //데이터타입 Map
		ArrayList<Student> list2 = (ArrayList<Student>)map.get("list");
		for(Student s : list2) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"
					+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}//end print()
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();//맵 인스턴스
		List<Student> list = new ArrayList<>();   //리스트 인스턴스
		list.add(new Student("2022001", "hoya", "영어", 1, "hyeya"));
		list.add(new Student("2022002", "hodung", "컴공", 1, "hyedung"));
		list.add(new Student("2022003", "jongho", "경영", 1, "jihye"));
		//list에 3개의 레코드가 저장
		map.put("list", list);//맵에 리스트를 추가
		
		print(map); //static메서드(객체 생성없이 사용 가능)
		
	}
}
