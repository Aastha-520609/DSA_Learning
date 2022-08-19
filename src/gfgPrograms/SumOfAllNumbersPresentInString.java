package gfgPrograms;
import java.util.*;
public class SumOfAllNumbersPresentInString {
	public static long findSum(String str)
    {
        // your code here
        String temp = "0";
        int sum = 0;
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
            {
                temp = temp + ch;
            }
            else
            {
                sum = sum + Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }
	public static void main(String[] args)
	{
		String str = "12abc20yz68";
		 
        // Function call
		//findSum(str);
        System.out.println(findSum(str));
	}

}
