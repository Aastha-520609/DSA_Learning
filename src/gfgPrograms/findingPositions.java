package gfgPrograms;
import java.io.*;
import java.util.*;
/* Question:
Some people(n) are standing in a queue. A selection process follows a rule where people standing on even positions are selected. Of the selected people 
a queue is formed and again out of these only people on even position are selected. This continues until we are left with one person. 
Find out the position of that person in the original queue.
Sample Input : n = 5;
1 2 3 4 5 - number at even places is 2 4 and again number in even is 4. 
*/
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
