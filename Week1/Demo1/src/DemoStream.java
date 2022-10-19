import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class DemoStream {

	//Stream API is used to process collections of objects
	// Iterating list elements
	public static void iterateStream(List<String> l1) {
		Iterator<String> iterator = l1.stream().iterator();
		while (iterator.hasNext()) {
			System.out.println("Iterating list elements :" + iterator.next());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<Integer>();
		// Adding elements to list
		for (int i = 1; i < 20; i++) {
			myList.add(i);

		}
		// sequential stream
		myList.stream().forEach(n -> System.out.println("values :" + n));

		// parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		Stream<Integer> highNum = parallelStream.filter(n -> n > 10);
		highNum.forEach(n -> System.out.println("highest number :" + n));

		List<String> list1 = Arrays.asList("Sindhu", "Sai", "sree", "Ram");
		System.out.println("Count of elements in list :" + list1.stream().count());// count of elements in list

		// calling iterateStream method
		DemoStream.iterateStream(list1);

		// stream creating directly
		Stream<Integer> st = Stream.of(1, 2, 3, 4, 5);
		st.limit(2).forEach(n -> System.out.println("limit operation :" + n));
		
		

	}

}
