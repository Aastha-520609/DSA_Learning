package gfgPrograms;
import java.util.*;
import java.io.*;
public class validSubString {
	public static int findMaxLen(String S) {
        // code here
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int count = 0;
        for(int i=0; i<S.length(); i++)
        {
            if(S.charAt(i) == '(')
            {
                st.push(i);
            }
            else
            {
                st.pop();
                if(!st.isEmpty())
                {
                    count = Math.max((i-st.peek()),count);
                }
                else
                {
                    st.push(i);
                }
                  
            }
        }
        return count;
    }
	public static void main(String[] args)
	{
	  String S = "()(())(";
	  System.out.println(findMaxLen(S));
	}
}
