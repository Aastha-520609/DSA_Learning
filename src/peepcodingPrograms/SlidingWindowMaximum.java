import java.io.*;
import java.util.*;
public class SlidingWindowMaximum {	
	public static void main(String[] args)throws Exception
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = Integer.parseInt(br.readLine());
			}
			System.out.println("Enter the value of k: ");
			int k = Integer.parseInt(br.readLine());
			
			
			Stack<Integer> st = new Stack <> ();
			int[] nge = new int[arr.length];
			
			st.push(arr.length - 1);
			nge[arr.length - 1] = arr.length;
			for(int i=arr.length-2; i>=0; i--)
			{
				while(st.size() > 0 && arr[i] >= st.peek())
				{
					st.pop();
				}
				if(st.size() == 0)
				{
					nge[i] = arr.length;
				}
				else
				{
					nge[i] = st.peek();
				}
				st.push(arr[i]);
			}
			int j=0;
			for(int i=0; i<=arr.length-k; i++)
			{
				//loop for max
				if(j < i)
				{
					j = i;
				}
				while(nge[j] < i+ k)
				{
					j = nge[j];
				}
				System.out.println(arr[j]);
		   }
	}
}
