package gfgPrograms;
import java.util.*;
public class RemainderWith7 {
	public static int remainderWith7(String num)
    {
        // Your code here
		int rem = 0;
        for(int i=0; i<num.length(); i++)
        {
            rem = rem*10 + (num.charAt(i) - '0');
            rem = rem % 7;
        }
        return rem;
    }
	public static void main(String args[])
	{
	   String num = "8";
	   System.out.println(remainderWith7(num));
	}

}
