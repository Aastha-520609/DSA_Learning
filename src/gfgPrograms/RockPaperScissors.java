package gfgPrograms;
import java.util.*;
/*Rock crushes scissor
Scissor cuts paper
Paper envelops rock*/
public class RockPaperScissors {
	public static String gameResult(String s)
    {
        // your code here
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
            {
                return "DRAW";
            }
            else if(s.charAt(i) == 'R' && s.charAt(i+1) == 'S')
            {
                return "A";
            }
            else if(s.charAt(i) == 'S' && s.charAt(i+1) == 'P')
            {
                return "A";
            }
            else if(s.charAt(i) == 'P' && s.charAt(i+1) == 'R')
            {
                return "A";
            }
            else
            {
               return "B"; 
            }
        }
        return "0";
    }
	public static void main(String[] args)
	{
		String s = "PS";
		String result = gameResult(s);
		System.out.println(result);
		
	}

}
