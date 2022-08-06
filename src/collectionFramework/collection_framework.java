package collectionFramework;
import java.util.ArrayList;
public class collection_framework {
	public static void main(String[] args)
	{
		//Syntax for empty arraylist
		//ArrayList<datatype> array_name = new ArrayList<>();
		ArrayList<String> List = new ArrayList<String>();
		//To add elements int the empty arraylist we use
		//List.add(any variable);
		List.add("Aastha");
		List.add("Aastha");
		//add element in between the two element
		List.add(1,"Pasta");
		System.out.println(List);
		//Creating another list and adding the older list in new list
		ArrayList<String> newList = new ArrayList<String>();
		newList.add("khasta");
		newList.add("Nasta");
		System.out.println(newList);
		List.addAll(newList);
		System.out.println(List);
		//Print the element of specific index
		System.out.println(List.get(2));
		//remove the position from list
		List.remove(2);
		System.out.println(List);
		//remove the element from the list
		List.remove(String.valueOf("Nasta"));
		System.out.println(List);
		//to clear all the elements of the list
		//List.clear();
		//System.out.println(List);
		
		//Set is used to update the element in specific function
		List.set(1, "Nasta");
        System.out.println(List.contains("sasta"));
		//traversing the array using loop , It helps to get the element of the arrays
        for(int i=0;i<List.size(); i++)
        {
        	System.out.println("The element is " + List.get(i));
        }
		//Using for each
        for(String element: List)
        {
        	System.out.println("For Each the element is " + element);
        } 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		;
		System.out.println(List);
	}
}
