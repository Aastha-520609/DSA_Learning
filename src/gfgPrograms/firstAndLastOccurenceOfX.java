package gfgPrograms;
import java.util.ArrayList;
public class firstAndLastOccurenceOfX {
	public static ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            array.add(arr[i]);
        }
        int a = array.indexOf(x);
        int b = array.lastIndexOf(x);
        ArrayList<Integer> result = new ArrayList<>();
        if(a == -1 && b == -1)
        {
            result.add(-1);
        }
        else
        {
           result.add(a);
           result.add(b);  
        }
        return result;
    }
	    public static void main(String[] args)
	    {
	    	int arr[] = {1,3,3,4};
	    	int n = 4;
	    	int x = 3;
	    	ArrayList<Integer> ans = firstAndLast(arr,n,x);
	    	System.out.println(ans);
	    }
}
