package collectionFramework;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Tree_map {
	public static void main(String[] args)
	{
		//Treemap works on sorted manner, the keys are sorted here
		Map<String, Integer> numbers = new TreeMap<>();
		
		numbers.put("Dog", 1);
		numbers.put("Cat", 2);
		System.out.println(numbers);
		
		//remove function is used to remove a particular element
		numbers.remove("Cat");
		System.out.println(numbers);
	}

}
