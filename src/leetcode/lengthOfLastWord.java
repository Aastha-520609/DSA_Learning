package leetcode;
import java.util.*;
public class lengthOfLastWord {
	public static int lenOfLastWord(String s) {
        String str = s.trim();
        int counter = 0;
        for(int i=str.length()-1; i>=0; i--)
        {
           if(str.charAt(i) != ' ')
           {
               counter++;
           }
           else
           {
               break;
           }
        }
        return counter;
    }
	public static void main(String args[])
	{
	  String input = "Hello World";
	  int length = lenOfLastWord(input);
	  System.out.println(length);
	}
}
