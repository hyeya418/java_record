package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
	public static void main(String[] args) {
		//내가 만든 클래스가 데이터 타입이 될 수 있다.
		List<Member> list = new ArrayList<Member>(); //제너릭
		
//		방법1.
		Member m1 = new Member(); //Member클래스의 객체 생성과 기본생성자 호출
		m1.setName("정호둥");
		m1.setUserid("hodung");
		m1.setPasswd("1004");
		m1.setTel("02-123-4567");
		m1.setEmail("hodung@naver.com");
		
		list.add(m1);//ArrayList에 Member객체를 1개 추가
//		System.out.println("list사이즈 : "+list.size());
		
//		방법2. 생성자를 통해 데이터 초기화
		Member m2 = new Member("ggodung", "1234", "정꼬둥", "02-222-3333", "ggodung@nate.com");
		list.add(m2);
//		System.out.println("list사이즈 : "+list.size());

//		방법3. add()메소드내에서 생성자 활용
		list.add(new Member("bbodung", "4321", "정뽀둥", "02-777-8888", "bbodung@gmail.com"));
//		System.out.println("list사이즈 : "+list.size());

		System.out.println("이름\t아이디\t비번\t전화\t\t이메일");
		for(int i=0;i<list.size();i++) {
			Member m = list.get(i);//여기서 m은 ArrayList의 각 데이터를 가리킬 임시 참조변수
			System.out.println(m.getName()+"\t"+m.getUserid()+"\t"
			+m.getPasswd()+"\t"+m.getTel()+"\t"+m.getEmail());
		}
	}

}
