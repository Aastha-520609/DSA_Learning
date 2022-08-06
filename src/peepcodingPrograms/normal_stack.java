import java.io.*;
import java.util.*;
class Stack
{
	private int arr[];
	private int top;
	private int capacity;
	
	Stack(int size)
	{
		arr = new int[size];
		capacity = size;
		top = -1;
	}
	
	public void push(int x)
	{
		if(isFull())
		{
			System.out.println("Overflowing\nProgram Terminated\n");
			System.exit(-1);
		}
	}
}
public class normal_stack {
	public static void main(String[] args)
	{
		Stack stack = new Stack(3);
		
		stack.push(1);
		stack.push(2);
		
		stack.pop();
		stack.pop();
		
		stack.push(3);
		
		System.out.println("The top element is: "+ stack.peek());
		System.out.println("The stack size is: "+ stack.size());
		
		stack.pop();
		
		if(stack.isEmpty())
		{
			System.out.println("The stack is empty");
		}
		else
		{
			System.out.println("The stack is not empty");
		}
	}
}
