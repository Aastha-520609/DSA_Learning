package gfgPrograms;
import java.util.*;
import java.io.*;
public class queueReversal {
	public static Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty())
        {
            st.push(q.remove());
        }
        
        while(!st.isEmpty())
        {
           q.add(st.pop());   
        }
        return q;
    }
	public static void main(String args[])
	{
		Queue<Integer> q = new LinkedList<>();
		q.add(4);
		q.add(3);
		q.add(1);
		q.add(10);
		q.add(2);
		q.add(6);
		rev(q);
		while(!q.isEmpty())
		{
			int x = q.peek();
			q.poll();
			System.out.print(x+" ");
		}
	}
}
