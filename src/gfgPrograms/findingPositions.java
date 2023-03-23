package gfgPrograms;
import java.io.*;
import java.util.*;
public class findingPositions {
	 public static long nthPosition(long n){
	        return findPosition(1,n);
	    }
	 public static long findPosition(long index, long n)
	    {
	        if(index > n)
	        {
	            return index/2;
	        }
	        else
	        {
	            index = index * 2;
	            return findPosition(index,n);
	        }
	    }
	 public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 System.out.println(findPosition(1,n));
	 }
}
