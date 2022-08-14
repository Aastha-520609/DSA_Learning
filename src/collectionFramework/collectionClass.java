package collectionFramework;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
public class collectionClass {
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		list.add(34);
		list.add(12);
		list.add(78);
		list.add(34);
		list.add(45);
		System.out.println(list);
		//to get minimum value from the above array
		System.out.println("Minimum Element is " + Collections.min(list));
		// to get maximum value from the above array
		System.out.println("Maximum Element is " + Collections.max(list));
		//to get frequency
		System.out.println("Frequency is " + Collections.frequency(list, 12));
		//collection sort helps to sort any classes inside collection
		Collections.sort(list);
		System.out.println(list);
	}

}
