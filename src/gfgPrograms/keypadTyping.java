package gfgPrograms;
import java.util.*;
public class keypadTyping {
	public static String printNumber(String s, int n) 
	{
	    //Your code here
		//number is acc abcdefghijklmnopqrstuvwxyz
	    String number ="22233344455566677778889999";
	    String result = "";
	    for(int i=0; i<n; i++)
	    {
	        int val = s.charAt(i) - 'a';
	        result = result + number.charAt(val);
	    }
	    return result;
	}
	public static void main(String[] args)
	{
		String s = "amazon";
		int n = 6;
		String res = printNumber(s,n);
		System.out.println(res);
		
	}

}
