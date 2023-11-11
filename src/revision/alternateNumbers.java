package revision;
import java.util.*;
public class alternateNumbers {
	public static int[] alternateNumbers(int []a) {
        // Write your code here
       ArrayList<Integer> positive = new ArrayList<>();
       ArrayList<Integer> negative = new ArrayList<>();

       for(int i=0; i<a.length; i++)
       {
           if(a[i] > 0)
           {
               positive.add(a[i]);
           }
           else
           {
               negative.add(a[i]);
           }
       }

       for(int i=0; i<a.length/2; i++)
       {
           a[2*i] = positive.get(i);
           a[2*i+1] = negative.get(i);
       }

       return a;
    }
	public static void main(String args[])
	{
	  int[] array = {1,2,-4,-5};
	  int[] res = alternateNumbers(array);
	  for(int i=0; i<res.length; i++)
	  {
		  System.out.print(res[i] + " ");
	  }
	}
}
