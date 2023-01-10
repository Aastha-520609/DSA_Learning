package gfgPrograms;
import java.util.*;
import java.io.*;
public class easyString {
	public static String transform(String S) 
    {
        // code here
        S = S.toLowerCase();
        Stack<Character> st = new Stack<>();
        for(int i=S.length()-1; i>=0; i--)
        {
            st.push(S.charAt(i));
        }
        int count = 1;
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty())
        {
            char ch = st.pop();
            if(!st.isEmpty() && ch == st.peek())
            {
                count++;
            }
            else
            {
                str.append(count);
                str.append(ch);
                count = 1;
            }
        }
        return str.toString();
    }
	public static void main(String[] args)
	{
		String S = "aaABBb";
		System.out.print(transform(S));
	}

}
