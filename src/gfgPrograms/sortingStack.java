package gfgPrograms;
import java.util.*;
import java.io.*;
public class sortingStack {
	public static Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		Stack<Integer> st = new Stack<>();//temporary stack
		while(!s.isEmpty())
		{
		    int temp = s.pop();
		    while(!st.isEmpty() && st.peek()>temp)
		    {
		        int ele = st.pop();
		        s.push(ele);
		    }
		    st.push(temp);
		}
	   return st;	
	}
	public static void main(String[] args)
	{
		Stack<Integer> st = new Stack<Integer>();
		st.push(11);
		st.push(2);
		st.push(32);
		st.push(3);
		st.push(41);
		System.out.println(sort(st));
	}

}
