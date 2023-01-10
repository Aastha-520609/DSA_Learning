package gfgPrograms;
import java.util.*;
import java.io.*;
public class getMinAtPop {
	public static Stack<Integer> _push(int arr[],int n)
    {
        // your code here
        Stack<Integer> st = new Stack<Integer>();
        int min = arr[0];
        for(int i=0; i<n; i++)
        {
                min = Math.min(min,arr[i]);
                st.push(min);
        }
        return st;
    }
    public static void _getMinAtPop(Stack<Integer>s)
    {
        while(!s.isEmpty())
        {
            System.out.print(s.pop()+ " ");
        }
    }
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5};
		int n = 5;
		Stack<Integer> s = new Stack<>() ;
		_push(arr,n);
		_getMinAtPop(s);
		System.out.println();
	}
}