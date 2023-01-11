package gfgPrograms;
import java.util.*;
import java.io.*;
public class parenthesisChecker {
	public static void ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<x.length(); i++)
        {
            char ch = x.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
            {
                st.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']')
            {
                if(st.size() == 0)
                {
                    System.out.println("Unbalanced");
                }
                else if( ch == ')' && st.peek() == '(')
                {
                    st.pop();
                }
                else if( ch == '}' && st.peek() == '{')
                {
                    st.pop();
                }
                else if( ch == ']' && st.peek() == '[')
                {
                    st.pop();
                }
                else
                {
                	System.out.println("Unbalanced");
                }
            }
        }
        if(st.isEmpty())
        {
        	System.out.println("Balanced");
        }
        else
        {
        	System.out.println("Unbalanced");	
        }
    }
	public static void main(String[] args)
	{
	  String x = "[{()}]";
	  ispar(x);
	}
}
