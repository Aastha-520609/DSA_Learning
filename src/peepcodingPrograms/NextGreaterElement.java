package peepcodingPrograms;

import java.io.*;
import java.util.*;
import java.util.Stack;
public class NextGreaterElement {
	public static void display(int[] a)
	{
		StringBuilder sb = new StringBuilder();
		
		for(int val:a)
		{
			sb.append(val + "\n");
		}
		System.out.println(sb);
	}
	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = Integer.parseInt(br.readLine());
		}
		
		int[] nge = solve(a);
		display(nge);
	}
	public static int[] solve(int[] arr)
	{
		int[] nge = new int[arr.length];
		
		Stack<Integer> st = new Stack <> ();
		st.push(arr[arr.length - 1]);
		nge[arr.length - 1] = -1;
		//1. The element is pop out of the stack if it is smaller than the upcoming element.
		//2. If no element is smaller in the stack than than the upcoming element then the element present in the stack is its greatest element 
		// and the upcoming element is pushed into stack.
		for(int i=arr.length-2; i>=0; i--)
		{
			//the element is pop if stack has some element in it and if the coming element is greater and equal to the peek element
			while(st.size() > 0 && arr[i] >= st.peek())
			{
				st.pop();
			}
			//if the stack has no element than the coming element has no greater element so -1.
			if(st.size() == 0)
			{
				nge[i] = -1;
			}
			//put the coming element to the peek of the stack after checking
			else
			{
				nge[i] = st.peek();
			}
			st.push(arr[i]);
		}
      return nge;
	}
}