package revision;
import java.util.*;
public class longestCommonPrefix {
	public static String longestCommonPrefix(String arr[], int n){
        // code here
        if (n == 0) 
        {
            return "-1";
        }
        
        String start = arr[0];
        int minLen = start.length();
        
        for(int i=1; i<n; i++)
        {
            int j = 0;
            String current = arr[i];
            while ( j < minLen && j < current.length() && start.charAt(j) == current.charAt(j))
            {
                j++;
            }
            
            minLen = j;
        }
        
        if(minLen == 0)
        {
            return "-1";
        }
        
        return start.substring(0, minLen);
    }
	public static void main(String args[])
	{
		String[] input1 = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String[] input2 = {"d", "d", "d", "d"};

        String result1 = longestCommonPrefix(input1, input1.length);
        String result2 = longestCommonPrefix(input2, input2.length);

        System.out.println("Result for input1: " + result1); // Output: "gee"
        System.out.println("Result for input2: " + result2); // Output: "d"
		
	}
}
