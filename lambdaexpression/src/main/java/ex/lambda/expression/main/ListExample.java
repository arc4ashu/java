package ex.lambda.expression.main;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<String> items=new ArrayList<>();
		items.add("item1");
		items.add("item2");
		items.add("item3");
		items.add("item4");
		items.add("item5");
		items.add("item6");
		
		items.forEach(item->System.out.println(item));
	}
	
	
}
