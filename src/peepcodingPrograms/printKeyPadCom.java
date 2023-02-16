package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class printKeyPadCom {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printKPC(str,"");
	}
	
	static String[] codes = {".;", "abc", "def", "ghi","jkl","mno","pqrs","tu","vwx","yz"};
	public static void printKPC(String ques, String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0); // 6
		String rem_ques = ques.substring(1); //78
		
		String codeforch = codes[ch - '0']; // taking value of 6 index
		for(int i=0; i<codeforch.length(); i++) //pqrs
 		{
			char chcode = codeforch.charAt(i);
			printKPC(rem_ques,ans + chcode);
 		}
		
	}

}
