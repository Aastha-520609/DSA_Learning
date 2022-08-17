package gfgPrograms;
import java.util.*;
public class findNumberOfNumbers {
	 public static int num(int a[], int n, int k)
     {
          //Your code here
          int count = 0;
          char b = (char)(k+'0');
          String str = Arrays.toString(a);
          for(int i=0; i<str.length(); i++)
          {
              if(str.charAt(i) == b)
              {
                  count++;
              }
          }
         return count;
     }
	public static void main(String[] args)
	{
		int n = 5;
		int array[] = {11,12,13,14,15};
		int k = 2;
		int tot_ele = num(array,n,k);
		System.out.println(tot_ele);
	}

}
