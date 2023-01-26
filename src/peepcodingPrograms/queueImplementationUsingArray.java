package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class queueImplementationUsingArray {
	public static class arrayQueue
	{
		int size;
		int front;
		int rear;
		int[] data;
		
		public arrayQueue(int cap)
		{
		   data = new int[cap];
		   front = 0;
		   size = 0;
		}
		int size()
		{
			return size;
		}
		
	    int remove()
		{
			if(size == 0)
			{
				System.out.println("Queue Underflow");
			}
			else
			{
				int val = data[front];
				front = (front + 1) % data.length;
				size--;
				return val;
			}
			return -1;
		}
	    
		int peek()
		{
			if(size == 0)
			{
				System.out.println("Queue Underflow");
				return -1;
			}
			else
			{
				return data[front];
			}
		}
		
		void add(int val)
		{
			if(size == data.length)
			{
				System.out.println("Queue Overflow");
			}
			else
			{
				rear = (front + size) % data.length;
				data[rear] = val; // inserting element at rear;
				size++;
			}
		}
		void display()
		{
			for(int i = 0; i < size; i++)
			{
				int index = (front + i) % data.length;
				System.out.println(data[index] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)throws Exception
	{
		arrayQueue q = new arrayQueue(4);
		q.display();
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.display();
		q.add(60);
		q.remove();
	    q.remove();
	    System.out.println(
	            "after two node deletion:");
	    q.display();
	    System.out.println("Peek Elem is:" +  q.peek());
	 }	
	}
