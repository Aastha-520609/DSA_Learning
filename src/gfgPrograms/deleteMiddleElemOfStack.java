package gfgPrograms;
import java.util.*;
import java.io.*;
public class deleteMiddleElemOfStack {
	public static void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        Stack<Integer> st = new Stack<Integer>();
        int n = (sizeOfStack)/2;
        for(int i=0; i<n; i++)
        {
            st.push(s.pop());
        }
        s.pop();
        while(!st.isEmpty())
        {
            s.push(st.pop());
        }
    }
	public static void main(String[] args)
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		int size = 5;
		deleteMid(s,size);
		while(!s.isEmpty())
		{
			System.out.print(s.pop() + " ");
		}
		
	}

}
