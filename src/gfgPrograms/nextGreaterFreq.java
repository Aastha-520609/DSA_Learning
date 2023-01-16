package gfgPrograms;
import java.util.*;
import java.io.*;
public class nextGreaterFreq {
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
		int n = 6;
		int arr[] = {2,1,1,3,2,1};
		
		int ngf[] = print_next_greater_freq(arr,n);
		display(ngf);
	}
	public static int[] print_next_greater_freq(int arr[], int n)
    {
        Stack<Integer> st = new Stack<Integer>();
        int ngf[] = new int[n];
        st.push(arr[arr.length-1]);
        ngf[arr.length - 1] = -1;
        //Finding frequency of a number
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<arr.length; i++)
        {
          if(map.containsKey(arr[i]))
          {
              map.put(arr[i],map.get(arr[i]) + 1);
          }
          else
          {
              map.put(arr[i],1);
          }
        }
        //Using concept of next greater elem;
        for(int i=arr.length-2; i>=0; i--)
        {
           while(!st.isEmpty() && map.get(st.peek()) <= map.get(arr[i]))
            {
               st.pop();
            }
           if(st.isEmpty())
           {
               ngf[i] = -1;
           }
           else
           {
               ngf[i] = st.peek();
           }
           st.push(arr[i]);
        }
         return ngf;
       }
}
