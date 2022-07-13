package MyProject;

import java.util.ArrayList;
import java.util.List;

public class ProductUse {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		//방법1
		Product p1 = new Product();
		p1.setName("냉장고");
		p1.setCompany("삼성");
		p1.setDate("20220101");
		p1.setCost(200);
		p1.setCount(4);
		p1.cal();
		
		list.add(p1);
		
		//방법2
		Product p2 = new Product("TV", "LG", "20220101", 300, 2);
		p2.cal();
		list.add(p2);
		
		Product p3 = new Product("에어컨", "위니아", "20220101", 100, 2);
		p3.cal();
		list.add(p3);
		
		System.out.println("------------------------------------------------------");
		System.out.println("제품명\t제조사\t제조일자\t\t단가(만원)\t수량\t금액");
		System.out.println("------------------------------------------------------");
		p1.print();
		p2.print();
		p3.print();
		System.out.println("------------------------------------------------------");
		
		
	}
	
}
