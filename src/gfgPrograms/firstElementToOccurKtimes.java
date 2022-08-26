package gfgPrograms;
import java.util.Map;
import java.util.HashMap;
public class firstElementToOccurKtimes {
	static int firstElement(int[] a, int n, int k)
	{
		 Map<Integer,Integer> map = new HashMap<>();
	       if(k==1)
	       {
	         return a[0];  
	       }
	       for(int i=0;i<n;i++)
	       {
	           if(map.containsKey(a[i]))
	           {
	               int count = map.get(a[i]);
	               //System.out.println(count);
	               if(count+1 == k)
	               {
	                 return a[i];   
	               }
	               map.put(a[i],count+1);
	           }
	           else
	           {
	             map.put(a[i],1);   
	           }
	       }
	       return -1;
	}
	public static void main(String[] args)
	{
		int arr[] = {1, 7, 4, 3, 4, 8, 7};
		int n = arr.length;
		int k = 2;
		int index = firstElement(arr,n,k);
		System.out.print(index);
	}

}
