package gfgPrograms;
import java.util.*;
public class reverseEachWord {
	public static String reverseWords(String S)
    {
        // your code here
        Stack<Character> st = new Stack<Character>();
        String a="";
        for(int i=0; i<S.length(); i++)
        {
            if(S.charAt(i) != '.')
            {
                st.push(S.charAt(i));
            }
            else
            {
                while(!st.isEmpty())
                {
                    a = a + st.pop();
                }
                a = a + ".";
            }
        }
        while(!st.isEmpty())
        {
            a = a + st.pop();
        }
        return a;
    }
	public static void main(String[] args)
	{
		String S = "i.like.this.program.very.much";
		System.out.println(reverseWords(S));
	}
	
}
