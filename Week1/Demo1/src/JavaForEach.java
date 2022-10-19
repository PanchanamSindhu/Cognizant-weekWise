import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaForEach {
	
	public static void main(String[] args) {
		
		//Iterate list using forEach
		List<String> names=Arrays.asList("Sindhu","Jhon","Bob","peter");
		names.forEach(System.out::println);
		System.out.println("++++++++++++Ordered List++++++++++++++++++++++++==");
		names.stream().parallel().forEachOrdered(System.out::println);
		
		
		//map
		System.out.println("++++++++++++++++++++++++++++++++++++==");
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("pens", 5);
		m1.put("pencils", 10);
		m1.put("Books", 15);
		m1.forEach((k,v)->System.out.println("Item :"+k +"," + "Quantity :"+v));
	}
	

}
