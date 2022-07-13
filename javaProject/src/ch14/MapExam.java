package ch14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExam {
	public static void main(String[] args) {
		//List : 순서대로 저장, Map : 순서가 없다. 키, 값으로 처리
		Map<String, String> map = new HashMap<>(0);
		//Map<key, value>
		map.put("한국", "서울"); //map.put(key,value):내용 추가 메서드
		System.out.println(map.get("한국")); //map.get() 값을 가져오는 메서드
		map.put("일본", "동경");
		map.put("중국","북경");
		map.put("미국","워싱턴");
		map.put("태국","방콕");
		map.put("영국","런던");
		System.out.println(map);
		String nation = "영국";
		System.out.println(nation+"의 수도는 "+map.get(nation));
		
		//Iterator : 반복처리를 위한 객체(for문과 유사한 기능)
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) { //hasNext():읽어 올 요소가 남아있는지 확인함
			String key = (String)iterator.next(); //next():다음 요소를 읽어 옴
			System.out.print("key="+key);
			System.out.println(", value="+map.get(key));
		}
	}

}
