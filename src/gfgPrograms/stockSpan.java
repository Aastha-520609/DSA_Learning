package gfgPrograms;
import java.util.*;
import java.io.*;
public class stockSpan {
	public static void display(int[] a)
	{
		StringBuilder sb = new StringBuilder();
		for(int val:a)
		{
			sb.append(val + " ");
		}
		System.out.print(sb);
	}
	public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int span[] = new int[price.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;
        for(int i=1; i<price.length; i++)
        {
            while(st.size() > 0 && price[i] >= price[st.peek()])
            {
                st.pop();
            }
            
            if(st.size() == 0)
            {
                span[i] = i+1;
            }
            else
            {
                span[i] = i - st.peek();
            }
            
            st.push(i);
        }
        return span;
    }
	public static void main(String[] args)
	{
		int price[] = {100,80,60,70,60,75,85};
		int n = price.length;
		int span[] = calculateSpan(price,n);
		display(span);
	}
}
