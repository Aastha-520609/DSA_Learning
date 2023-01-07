package gfgPrograms;
import java.util.*;
import java.io.*;
public class pairwiseConsecutiveEle {
	 public static boolean pairWiseConsecutive(Stack<Integer> st)
	    {
	        // Your code here
	        if(st.size() % 2 != 0)
	        {
	            st.pop();
	        }
	        while(st.size() > 0)
	        {
	            int n1 = st.pop();
	            int n2 = st.pop();
	            if(Math.abs(n1-n2) != 1)
	            {
	                return false;
	            }
	        }
	        return true;
		}
	 public static void main(String[] args)
	 {
		 Stack<Integer> st = new Stack<Integer>();
		 st.push(1);
		 st.push(2);
		 st.push(3);
		 st.push(4);
		 st.push(5);
		 st.push(6);
		 //another testcase would be odd
		 if(pairWiseConsecutive(st) == true)
		 {
			 System.out.println("Yes");
		 }
		 else
		 {
			 System.out.println("No");
		 }
	 }

}
