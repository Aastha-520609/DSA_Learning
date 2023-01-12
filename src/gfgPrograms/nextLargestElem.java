package gfgPrograms;
import java.util.*;
import java.io.*;
public class nextLargestElem {
	public static void display(int[] a)
	{
		StringBuilder sb = new StringBuilder();
		
		for(int val:a)
		{
			sb.append(val + " ");
		}
		System.out.print(sb);
	}
	public static void main(String[] args)
	{
		int n = 4;
		int arr[] = {1,2,3,4};
		
		int nge[] = nextLargerElement(arr,n);
		display(nge);
	}
	public static int[] nextLargerElement(int[] arr, int n)
    { 
        // Your code here
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        
        st.push(arr[arr.length - 1]);
        nge[arr.length - 1] = -1;
        for(int i=arr.length-2; i>=0; i--)
        {
            //-a+
            while(st.size() > 0 && arr[i] >= st.peek())
            {
                st.pop();
            }
            if(st.size() == 0)
            {
                nge[i] = -1;
            }
            else
            {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }
}
