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
		//numbers.put("Two", 23); // if this is done then key value will change to 23, it will not remain 2 
		System.out.print(numbers);
		//if we want that the updation should not occur the we can do 
		/*if(!numbers.containsKey("Two"))
		{
			numbers.put("Two", 23);
		}*/
		//In place of this we can also do
		numbers.putIfAbsent("Two", 23);
		System.out.print(numbers + "\n");
		//iterating through map
		for(Map.Entry<String, Integer> e:numbers.entrySet())
		{
			System.out.println(e); // to get the entry (both key and value)
			System.out.println(e.getKey()); // to get only the key
			System.out.println(e.getValue()); // to get only the value
		}
		// if we only want keys then 
		System.out.println("Keys are: ");
		for(String key: numbers.keySet())
		{
			System.out.println(key);
		}
		//if we only want to get the values
		System.out.println("Values are: ");
		for(Integer value: numbers.values())
		{
			System.out.println(value);
		}
		//checks if particular value is present or not
		System.out.println(numbers.containsValue(3));
		//checks if map is empty or not
		System.out.println(numbers.isEmpty());
		//clear is used to clear the map
		//System.out.println(numbers.clear());
		
	}

}
