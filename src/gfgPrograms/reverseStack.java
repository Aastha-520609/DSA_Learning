package gfgPrograms;
import java.util.*;
import java.io.*;
public class reverseStack {
	public static void insertBottom(int ele, Stack<Integer> st)
    {
       if(st.size() ==0)
       {
           st.push(ele);
       }
       else
       //store top element in a temp variable
       {
           int temp = st.peek();
           st.pop();
           insertBottom(ele,st);
           st.push(temp);
       }
    }
    public static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.size() > 0)
        {
            int x = s.peek();
            s.pop();
            reverse(s);
            insertBottom(x,s);
        }
    }
	public static void main(String[] args)
	{
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		reverse(st);
		while(!st.empty())
		{
			System.out.println(st.peek());
			st.pop();
		}
	}
}
