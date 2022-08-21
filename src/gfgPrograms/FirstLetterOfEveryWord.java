package gfgPrograms;
import java.util.*;

public class FirstLetterOfEveryWord {
	   public static String firstAlphabet(String S) {
        // code here
        String res = new String();
        String[] a = S.split(" ");
        for(int i=0; i<a.length; i++)
        {
            String str = a[i];
            System.out.println(str);
            System.out.println(str.charAt(0));
        }
        return res;
    }
	public static void main(String[] args)
	{
		String str = "Sky is blue";
		String ele = firstAlphabet(str);	
		System.out.println(ele);
	}

}
