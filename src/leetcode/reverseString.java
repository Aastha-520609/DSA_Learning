package leetcode;
import java.util.*;
public class reverseString {
	public static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String reverse = "";
        for(int i=str.length -1; i>=0; i--)
        {
           reverse = reverse + str[i] + " ";
        }
        return reverse.trim();
    }
	public static void main(String args[])
	{
		String s = "Aastha Chaudhary";
		System.out.println(reverseWords(s));
	}

}
