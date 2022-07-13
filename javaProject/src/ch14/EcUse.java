package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcUse {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>(); //맵 객체 생성
		List<EC> list = new ArrayList<>();		   //리스트 객체 생성
		
		list.add(new EC(1234, "2022-05-13", "티셔츠", "삼성", "37918111168", 55900));
		list.add(new EC(2345, "2022-04-11", "컴퓨터", "롯데", "15918222268", 2555000));
		list.add(new EC(3456, "2022-05-05", "커 피", "현대", "27918333368", 1200));
		map.put("list", list);
		print(map);
		
	}
	static void print(Map map) {
		ArrayList<EC> list2 = (ArrayList<EC>) map.get("list");
		System.out.println("----------------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
		System.out.println("----------------------------------------------------------------");
		for(EC e : list2) {
			System.out.println(e.getNo()+"\t"+e.getOrderDate()+"\t"+e.getProduct()
			+"\t"+e.getCardName()+"\t"+e.getCardNo().replace(e.getCardNo().substring(5, 9), "****")
			+"\t"+String.format("%,d",e.getPay()));
		}
		System.out.println("----------------------------------------------------------------");

	}
}
