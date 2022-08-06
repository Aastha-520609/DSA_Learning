import java.io.*;
import java.util.*;
public class PostfixConversion {
	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any postfix Expression");
		String exp = br.readLine();
		
		Stack <String> prefix = new Stack<>();
		Stack <String> infix = new Stack<>();
		
		for(int i=0; i<exp.length(); i++)
		{
			char ch = exp.charAt(i);
			
			if(ch == '+' || ch == '-' || ch == '*' || ch =='/')
			{
				String v2 = prefix.pop();
				String v1 = prefix.pop();
				String prefix_value = ch + v1 + v2 ;
				prefix.push(prefix_value); 
				
				String i_v2 = infix.pop();
				String i_v1 = infix.pop();
				String postfix_value = "(" + i_v1 + ch + i_v2 + ")";
				infix.push(postfix_value); 
			}
			else
			{
				prefix.push(ch + "");
				infix.push(ch + "");
			}
		}
      System.out.println("Your prefix expression is: " + prefix.pop());
      System.out.println("Your infix expression is: " + infix.pop());
	}
}
