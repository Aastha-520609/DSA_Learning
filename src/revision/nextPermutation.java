package revision;
import java.util.*;
import java.io.*;
public class nextPermutation {
	public static ArrayList<Integer> nextPer(ArrayList<Integer> A) 
	{
		// Write your code here.
		int n = A.size();
		int index = -1;

		//Finding the breaking point where we can change the number into greater one.
		for(int i = n-2; i>=0; i--)
		{
			if(A.get(i) < A.get(i+1))
			{
               index = i;
			   break;
			}
		}

		//if break point doesn't exist then the next permutation will be same 
		if(index == -1)
		{
			Collections.reverse(A);
			return A;
		}

		//finding the next greater element and swaping it
		for(int i=n-1; i>index; i++)
		{
			if(A.get(i) > A.get(index))
			{
				int temp = A.get(i);
				A.set(i , A.get(index));
				A.set(index, temp);
				break;
			}
		}

		//After swaping, reverse the array after breaking point
		List<Integer> list = A.subList(index+1, n);
		Collections.reverse(list);
		return A;
	}
	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(5);
		
		ArrayList<Integer> res = nextPer(list);
		for(int i=0; i<res.size(); i++)
		{
			System.out.print(res.get(i) + " ");
		}
	}

}
