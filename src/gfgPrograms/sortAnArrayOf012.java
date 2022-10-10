package gfgPrograms;
import java.util.*;
public class sortAnArrayOf012 {
	public static void sort012(int a[], int n)
    {
        // code here 
       // Arrays.sort(a);(using sorting method)
       //without using sorting method
       int zero = 0;
       int one = 0;
       int two = 0;
       for(int i=0; i<n; i++)
       {
           if(a[i] == 0)
           {
               zero++;
           }
           else if(a[i] == 1)
           {
               one++;
           }
           else
           {
               two++;
           }
       }
       int i=0;
       while(i<zero)
       {
           a[i] = 0;
           i++;
       }
       while(i<(zero+one))
       {
           a[i] = 1;
           i++;
       }
       while(i<(zero+one+two))
       {
           a[i] = 2;
           i++;
       }
    }
	public static void main(String[] args)
	{
		int a[] = {0,1,2,0,1};
		int n = 5;
		sort012(a,n);
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i] + " ");
		}

	}

}
