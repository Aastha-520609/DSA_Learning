package gfgPrograms;
import java.util.*;
public class LenOfLastWord {
	public static int findLength(String s) 
    { 
        // code here
        int count = 0;
            for(int i=s.length()-1; i>=0; i--)
            {
                if(s.charAt(i) != ' ')
                {
                    count++;
                }
                if(i>=1)
                {
                  if(s.charAt(i) !=' ' && s.charAt(i-1) == ' ')
                   {
                     break;
                   }  
                }
            }
        return count;
    }
	public static void main(String[] args)
	{
		String s = "Geeks For Geeks";
		int result = findLength(s);
		System.out.println(result);
	}

}
