package gfgPrograms;
import java.util.*;
import java.io.*;
public class removeKDigits {
	public static String removeKdigits(String S, int K) {
        // code here
        //if k is equal to 0 remove string itself
        if(K == '0')
        {
            return S;
        }
        //if k is equal to the length of the string then return 0
        if(K == S.length())
        {
            return "0";
        }
        Stack<Character> st = new Stack<>();
        for(int i=0; i<S.length(); i++)
        {
            char ch = S.charAt(i);
            while(!st.isEmpty() && st.peek() > ch && K > 0)
            {
                st.pop();
                K--;
            }
            st.push(ch);
        }
        //if the given number is in ascending order than remove elements from last
        for(int i=0; i<K; i++)
        {
            st.pop();
            K--;
        }
        //Creating a string to add elements to it
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        sb.reverse();
        //if there is any leading 0 then
        while(sb.length() > 1 && sb.charAt(0) == '0')
        {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
	public static void main(String[] args)
	{
		String S = "149811";
		int K = 3;
		System.out.println(removeKdigits(S,K));
	}
}
