package gfgPrograms;
import java.util.*;
public class usingRecursionPrintNum {
	 public static void printNos(int N)
	    {
	        //Your code here
	        if(N == 0)
	        {
	            return;
	        }
	        printNos(N-1);
	        System.out.print(N + " ");
	    }
	public static void main(String[] args)
	{
		int N = 10;
		printNos(N);
	}
}
