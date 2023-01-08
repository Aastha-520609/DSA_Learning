package gfgPrograms;
import java.util.*;
import java.io.*;
public class postfixEvaluation {
	public static int evaluatePostFix(String S)
    {
        int ans = 0;
        Stack<Integer> postfix = new Stack<Integer>();
        for(int i=0; i<S.length(); i++)
        {
            char ch = S.charAt(i);
            if(Character.isDigit(ch))
            {
                postfix.push(ch-'0');
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
            {
                int v2 = postfix.pop();
                int v1 = postfix.pop();
                int operation_val = operation(v1,v2,ch);
                ans = postfix.push(operation_val);
            }
        }
        return ans; 
    }
    public static int operation(int v1, int v2, char operator)
    {
        if(operator == '+')
        {
            return v1+v2;
        }
        else if (operator == '-')
        {
            return v1-v2;
        }
        else if(operator == '*')
        {
            return v1*v2;
        }
        else
        {
            return v1/v2;
        }
    }
    public static void main(String[] args)
    {
      String S = "231*+9-";	
      System.out.println(evaluatePostFix(S));
    }
}