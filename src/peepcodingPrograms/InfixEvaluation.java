import java.io.*;
import java.util.*;
public class InfixEvaluation {
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any string: ");
		String exp = br.readLine();
		
		//We need two stack in this one for operands and one for operators
		Stack<Integer> operands = new Stack<>();
		Stack<Character> operators = new Stack<>();
		for(int i = 0; i < exp.length(); i++)
		{
			char ch = exp.charAt(i);
			
			if (ch == '(')
			{
				operators.push(ch); //push to operator stack
			}
			else if(Character.isDigit(ch))
			{
				operands.push(ch - '0'); // char to integer //push to operand stack
			}
			else if(ch == ')')//if ch is closed bracket then pop until the stack operators is not equal to front bracket
			{
				while(operators.peek() != '(') // jab tak operator stack main open bracket nahi miljata 
				{
					char operator = operators.pop(); // tab tak operator ko operators stacks sai pop karo aaur sath mai do digit ko bhi operands stack sai pop karo 
					int v2 = operands.pop();
					int v1 = operands.pop();
					//pop karney kai bad operation function ko call karo aaur after operation conduct hojaye , mila huwa value ko operator_value main store karo
					int operator_value = operation(v1, v2, operator);
					// auur phir woh value ko operands waley stack mai push kardo
					operands.push(operator_value);
				}
				operators.pop();
			}
			else if(ch == '+' || ch == '-' || ch == '*' || ch == '/')//if any of these operator is encountered
			{
			  //jaba samma operators stack ma element xadai xa ani operators ko top ma open bracket encounter hudaina 
				//ani operators ko top ko element greater than equal xa aauney operator ko ani 
			  while(operators.size() > 0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek()))
			  {
				    char operator = operators.pop(); 
					int v2 = operands.pop();
					int v1 = operands.pop();
					
					int operator_value = operation(v1, v2, operator);
					operands.push(operator_value); 
			  }
			  operators.push(ch);
			}
		}
		while(operators.size() != 0)
		{
			char operator = operators.pop();
			int v2 = operands.pop();
			int v1 = operands.pop();
			
			int operator_value = operation(v1, v2, operator);
			operands.push(operator_value);
		}
		System.out.println(operands.peek());
	}
	
	//this function shows which operator has greater precedence
	public static int precedence(char operator)
	{
		if(operator == '+')
		{
		  return 1;	
		}
		else if(operator == '-')
		{
		   return 1;	
		}
		else if(operator == '*')
		{
		   return 2;	
		}
		else 
		{
		   return 2;	
		}
	}
	//Second function to calculate
	public static int operation(int v1, int v2, char operator)
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
		else {
		   return v1 / v2;	
		}
		
	}

}
