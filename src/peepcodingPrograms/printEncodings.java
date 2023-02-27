package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class printEncodings {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		displayEncodings(str,"");
	}
    public static void displayEncodings(String question, String answer)
    {
    	if(question.length() == 0)
    	{
    		System.out.println(answer);
    		return;
    	}
    	else if(question.length() == 1)
    	{
    		char ch = question.charAt(0);
    		if(ch == '0')
    		{
    			return;
    		}
    		else
    		{
    			int characterValue = ch - '0'; //converts to numeric value
    			char code = (char)('a' + characterValue - 1); // this leads to if a then 1, b then 2, c- 3 and soon.
    			answer = answer + code;
    			System.out.println(answer);
    		}
    	}
    	else
    	{
    		char ch = question.charAt(0);
    		String restOfQuestion = question.substring(1);
    		if(ch == '0')
    		{
    			return;
    		}
    		else
    		{
    			int characterValue = ch - '0'; //converts to numeric value
    			char code = (char)('a' + characterValue - 1); // this leads to if a then 1, b then 2, c- 3 and soon.
    		    displayEncodings(restOfQuestion, answer+code);   
    		}
    		
    		//if atfirst only two characters are taken from the given string
    		String firstTwoChar = question.substring(0,2);
    		String restOfQuestionForFirstTwoChar = question.substring(2);
    		
    		//coverting firstTwochar in integer
    		int firstTwoCharValue = Integer.parseInt(firstTwoChar);
    		if(firstTwoCharValue <= 26)
    		{
    			char code = (char)('a' + firstTwoCharValue - 1); // this leads to if a then 1, b then 2, c- 3 and soon.
    			displayEncodings(restOfQuestionForFirstTwoChar	, answer+code);
    		}
    	}
    }
}
