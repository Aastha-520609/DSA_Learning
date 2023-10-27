package revision;
import java.util.*;
public class valueEqualToIndex {
	public static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        for(int i=0; i<n; i++)
        {
            if(arr[i] == i+1)
            {
                array.add(arr[i]);
            }
        }
        return array;
    }
	public static void main(String args[])
	{
		int[] array = {12,2,3,7,8};
		int n = array.length;
		ArrayList<Integer> result = valueEqualToIndex(array, n);
	    for (int element : result){
	            System.out.print(element + " ");
	        }
		
	}

}
