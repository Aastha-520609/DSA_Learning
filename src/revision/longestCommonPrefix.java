package revision;
import java.util.*;
public class longestCommonPrefix {
	public static String longest_common_prefix(String strs[]){
        // code here
		if(strs.length == 0)
        {
            return "";
        }

        int prefixLength = 0;
        //Runs till the str[0].length
        while(prefixLength < strs[0].length())
        {
           char ch = strs[0].charAt(prefixLength);

           for(int i=1; i<strs.length; i++)
           {
               if(prefixLength >= strs[i].length() || strs[i].charAt(prefixLength) != ch)
               {
                   return strs[0].substring(0, prefixLength);
               }
           }

           prefixLength++;
        }
        
        return strs[0].substring(0, prefixLength);
    }
	public static void main(String args[])
	{
		String[] input1 = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String[] input2 = {"flow", "flower"};

        String result1 = longest_common_prefix(input1);
        String result2 = longest_common_prefix(input2);

        System.out.println("Result for input1: " + result1); // Output: "gee"
        System.out.println("Result for input2: " + result2); //
		
	}
}
