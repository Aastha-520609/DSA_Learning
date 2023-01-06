package gfgPrograms;
import java.util.*;
import java.io.*;

class MyStack
{
	int arr[] = new int[5];
	int top = 0;
    
    public void push(int a)
	{
	    // Your code here
	    arr[top] = a;
	    top++;
	} 
	public int pop()
	{
        // Your code here
		int a = -1;
        if(top <= -1)
        {
            return -1;
        }
        a = arr[top];
        top--;
        return a;
	}
	public void display()
	{
		for(int n: arr)
		{
			System.out.print(n + " ");
		}
	}
}
public class StackUsingArray {
	public static void main(String[] args)
	{
		MyStack num = new MyStack();
		num.push(2);
		num.push(3);
		num.pop();
		num.push(4); 
		num.pop();
		
		num.display();
	}
}
