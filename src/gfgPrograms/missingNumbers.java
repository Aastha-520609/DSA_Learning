package gfgPrograms;
import java.util.*;
public class missingNumbers {
	public static int MissingNumber(int array[], int n) {
        // Your Code Here
        //int temp = 0;
        Arrays.sort(array);
        if(n > 1)
        {
           for(int i=0; i<n-1; i++)
           {
             if(array[i] != i+1)
              {
                return i+1;
              }
            }
        }
        return n;    
    }
	public static void main(String[] args)
	{
		int[] array = {1,2,3,5};
		int n = 5;
		System.out.print(MissingNumber(array,n));
	}

}
