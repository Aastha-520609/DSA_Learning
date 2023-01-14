package gfgPrograms;
import java.util.*;
public class infixToPostfix {
	public static String infixToPostfix(String exp) {
        // Your code here
        Stack<String> postfix = new Stack<>();
        Stack<Character> operators = new Stack<>();
        
        for(int i=0; i<exp.length(); i++)
        {
            char ch = exp.charAt(i);
            if(ch == '(')
            {
               operators.push(ch);
            }
            else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            {
                postfix.push(ch + "");
            }
            else if(ch == ')')
            {
                while(operators.peek() != '(' && operators.size() > 0)
                {
                   process(operators,postfix);
                }
                if(operators.size() > 0)
                {
                    operators.pop();
                }
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^')
            {
                while((operators.size() > 0) && (operators.peek() != '(') && (precedence(ch) <= precedence(operators.peek())))
                {
                    process(operators,postfix);
                }
                operators.push(ch);
            }
        }
        while(operators.size() > 0)
        {
            process(operators,postfix);
        }
        return (postfix.peek());
    }
    public static void process(Stack<Character> operators, Stack<String> postfix)
	 {
		    char operator = operators.pop();
 			
		    String post2 = postfix.pop();
 			String post1 = postfix.pop();
 			String post = post1+post2+operator;
 			postfix.push(post);
	 }
    public static int precedence(char operator)
    {
        if(operator == '^')
        {
            return 3;
        }
        if(operator == '+' || operator == '-')
        {
            return 1;
        }
        else if(operator == '*' || operator == '/')
        {
            return 2;
        }
        else
        {
            return -1;
        }
    }
	public static void main(String args[])
	{
		String exp = "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println(infixToPostfix(exp));
	}
}
