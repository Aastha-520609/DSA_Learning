package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class printSubsequence {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printSubSeq(str, "");
	}
    public static void printSubSeq(String ques,String ans)
    {
    	if(ques.length() == 0)
    	{
    		System.out.println(ans);
    		return;
    	}
    	char ch = ques.charAt(0);
    	String remaining_ques = ques.substring(1);
    	
    	printSubSeq(remaining_ques,ans+ch);
    	printSubSeq(remaining_ques,ans+"");
    }
}
