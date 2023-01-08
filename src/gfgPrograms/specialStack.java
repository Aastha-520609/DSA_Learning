package gfgPrograms;
import java.util.*;
import java.io.*;
public class specialStack {
	public static void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    s.push(a);
	}
	public static int pop(Stack<Integer> s)
        {
            //add code here.
            return s.pop();
	}
	public static int min(Stack<Integer> s)
        {
           //add code here.
           int min = s.peek();
           if(s.isEmpty())
           {
               return -1;
           }
           for(int i=0; i<s.size(); i++)
           {
               if(min > s.get(i))
               {
                   min = s.get(i);
               }
           }
        return min;
	}
	public static boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           if(s.size() == n)
           {
               return true;
           }
           else
           {
               return false;
           }
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           if(s.size() == 0)
           {
               return true;
           }
           else
           {
               return false;
           }
	}
	public static void main(String[] args)
	{
		Stack<Integer> st = new Stack<Integer>();
		st.push(18);
		st.push(19);
		st.push(29);
		st.push(15);
		st.push(16);
		System.out.println(min(st));
	}
}
