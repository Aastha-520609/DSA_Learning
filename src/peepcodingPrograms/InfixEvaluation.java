package peepcodingPrograms;

import java.io.*;
import java.util.*;
import java.util.Stack;
public class InfixEvaluation {
	public static void main(String args[]) throws Exception
	{
		//Taking input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any string: ");
		String exp = br.readLine();
		
		//We need two stack in this one for operands and one for operators
		Stack<Integer> operands = new Stack<>(); 
		Stack<Character> operators = new Stack<>();
		for(int i = 0; i < exp.length(); i++)
		{
			char ch = exp.charAt(i);
			//Here there are three things to do
			//1. To check if the coming ch is is open bracket, then push it into operators stack.
			if (ch == '(')
			{
				operators.push(ch); //push to operator stack
			}
			//2. If upcoming ch is any integer then convert it to int from char and push into operand stack.
			else if(Character.isDigit(ch))
			{
				operands.push(ch - '0'); // char to integer 
			}
			else if(ch == ')')//3.if ch is closed bracket then pop until the stack operators is not equal to opening bracket
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
				//Here is also three condition.
				//1. pop till operators size is not equal to 0.
				//2. pop till stack peek is not opening bracket.
				//3. pop till precedence of upcoming char is less than and equal to the char that is in peek of stack.
				//upcoming char is doing following calculation first.
			  while(operators.size() > 0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek()))
			  {
				    char operator = operators.pop(); 
					int v2 = operands.pop();
					int v1 = operands.pop();
					
					int operator_value = operation(v1, v2, operator);
					operands.push(operator_value); 
			  }
			  //now after calculation it is pushing itself into the stack.
			  operators.push(ch);
			}
		}
		//if some elements remain in the stack.
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
	//Second function to calculate the value
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
