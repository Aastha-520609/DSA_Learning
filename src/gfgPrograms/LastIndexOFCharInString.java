package gfgPrograms;
import java.util.*;
public class LastIndexOFCharInString {
	public static int LastIndex(String s, char p){
        // code here
        int index = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == p)
            {
                index = i; 
                continue;
            }
        }
        if(index > 0)
        {
            return index;
        }
        else
        {
            return -1;
        } 
    }
	public static void main(String args[])
	{
		String str = "Geeksofgeeks";
		char p = 'e';
		int result = LastIndex(str,p);
	    System.out.println(result);
		
	}

}
