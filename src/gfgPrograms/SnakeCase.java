package gfgPrograms;
import java.util.*;
public class SnakeCase {
	public static String snakeCase(String S , int n) {
        // code here
        String str = "";
        for(int i=0; i<S.length(); i++)
        {
            char ch = S.charAt(i); 
            if(Character.isLetter(ch))
            {
                if(Character.isUpperCase(ch))
                {
                   str += Character.toLowerCase(ch); 
                }
                else
                {
                    str += ch;
                }
            }
            else
            {
                str += '_';
            }
        }
        return str;
    }
	public static void main(String[] args)
	{
		int n = 14;
		String S = "Geeks ForGeeks";
		String result = snakeCase(S,n);
		System.out.println(result);
	}

}
