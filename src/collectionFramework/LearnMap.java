package collectionFramework;
import java.util.HashMap;
import java.util.Map;
public class LearnMap {
	public static void main(String args[])
	{
		//Map works as key and values. There is a key and its value is stored in a key, key and values type
		Map<String,Integer> numbers = new HashMap<>();
		//here key is string and values is Integer
		// to add elements we use put here
		numbers.put("One", 1);
		numbers.put("Two", 2);
		//We cannot add same element in the key, if we do so it gets updated.
		System.out.println(numbers);
		//iterating through map 
		for(Map.Entry<String, Integer> e:numbers.entrySet())
		{
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		//used keyset while working with keys
		
	}

}
