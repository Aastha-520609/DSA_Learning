package collectionFramework;
import java.util.Arrays;
public class arraysClass {
	public static void main(String[] args)
	{
		//Arrayclass manipulates arrays not arraylist
		//binary search using arraysClass
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int index = Arrays.binarySearch(numbers, 4); 
		System.out.println("The element is present at "+ index + "rd index.");
	}

}
