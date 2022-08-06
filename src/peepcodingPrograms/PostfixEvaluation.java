import java.io.*;
import java.util.*;
public class PostfixEvaluation {
	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any String: ");
		String exp = br.readLine();
		
		Stack<Integer> postfix = new Stack<>();
		for(int i=0; i<exp.length(); i++)
		{
			char ch = exp.charAt(i);
			
		   if (Character.isDigit(ch))
			{
			  postfix.push(ch - '0');
			}
			else if( ch == '+' || ch == '-' || ch == '*' || ch == '/')
			{		
					int v2 = postfix.pop();
					int v1 = postfix.pop();
					  
					int operator_value = operation(v1,v2,ch);
					postfix.push(operator_value); 
			}
		}
		System.out.println(postfix.pop());
	}
	public static int operation( int v1, int v2,char operator)
	{
		if(operator == '+')
		{
		  return v1 + v2;	
		}
		else if(operator == '-')
		{
		   return v1 - v2;	
		}
		else if(operator == '*')
		{
		   return v1 * v2;	
		}
		else 
		{
		   return v1 / v2;	
		}
	}	
}
