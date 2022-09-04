package gfgPrograms;
import java.util.*;
public class repeatedCharacter {
	public static char firstRep(String S)
    {
        // your code here
        for(int i=0; i<S.length(); i++)
        {
            for(int j=i+1; j<S.length(); j++)
            {
              if(S.charAt(i) == S.charAt(j))
              {
                return (S.charAt(i));  
              }
            }
        }
        return '#';
    }
	public static void main(String[] args)
	{
		String str = "geeksofgeeks";
		System.out.println(firstRep(str));
	}

}
