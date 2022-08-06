import java.io.*;
import java.util.*;
public class InfixConversion {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any String: ");
		String exp = br.readLine();
		
		Stack < String > postfix = new Stack < >  (); //stack to store operands as postfix
        Stack < String > prefix = new Stack < > (); //stack to store operands as prefix
	    Stack < Character > operators = new Stack < > (); // stack to store operators
	    
	    for(int i=0; i < exp.length(); i++)
	    {
	    	char ch = exp.charAt(i);
	    	if(ch == '(')
	    	{
	    		operators.push(ch);
	    	}
	    	else if((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' || ch <= 'Z'))
	    	{
	    		 // if we add double inverted comma in charter it becomes string
	    		postfix.push(ch + "");
	    		prefix.push(ch + "");
	    	}
	    	else if(ch == ')')
	    	{
	    		while(operators.peek() != '(' && operators.size() > 0)
	    		{
	    			process(operators,postfix,prefix);
	    		}
	    		if(operators.size() > 0)
	    		{
	    			operators.pop();
	    		}
	    	}
	    	else if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
	    	{
	    		while((operators.size() > 0) && (operators.peek() != '(') && (precedence(ch) <= precedence(operators.peek())))
	    		{
	    			process(operators,postfix,prefix);  
	    		}
	    	     operators.push(ch);	
	    	 }
	    }
	     while(operators.size() > 0)
    		{
	    	    process(operators,postfix,prefix); 	
    		}
	        System.out.println(postfix.peek());
	    	System.out.println(prefix.peek());
	   }
	
	 //function of process
	 public static void process(Stack<Character> operators, Stack<String> postfix, Stack<String> prefix)
	 {
		    char operator = operators.pop();
 			
		    String post2 = postfix.pop();
 			String post1 = postfix.pop();
 			String post = post1+post2+operator;
 			postfix.push(post);
 			
 			String pre2 = prefix.pop();
 			String pre1 = prefix.pop();
 			String pre = operator+pre1+pre2;
 			prefix.push(pre);
 				 
	 }
	
		//function to show which operator has greater element
	public static int precedence(char operator)
		{
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
				return 0;
			}
		}
}
