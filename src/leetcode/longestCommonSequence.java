package leetcode;
import java.util.*;
public class longestCommonSequence {
	public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int index = 0;
        while(index < str1.length() && index < str2.length())
        {
            if(str1.charAt(index) == str2.charAt(index))
            {
                index++;
            }
            else
            {
                break;
            }
        }
        return str1.substring(0,index);
    }
	public static void main(String args[])
	{
		String[] str = {"flower","flight","flow"};
		String commonprefix = longestCommonPrefix(str);
		System.out.println(commonprefix);
		
	}  
}
