package revision;
import java.util.*;
import java.io.*;
public class NormalStack {
	public static class CustomStack{
		int[] data;
		int tos;
		
		public CustomStack(int cap) {
			data = new int[cap];
			tos = -1;
		}
		
		int size() {
			return tos + 1;
		}
		
		void display() {
			for(int i=tos; i>=0; i--) 
			{
				System.out.print(data[i] + " ");
			}
			System.out.println();
		}
		
		void push(int val) {
			if(tos == data.length - 1)
			{
				System.out.println("Stack Overflow");
			}
			else 
			{
				tos++;
				data[tos] = val;
			}
		}
		
		int pop() {
			if(tos == -1) 
			{
				System.out.println("Stack underflow");
				return -1;
			}
			else
			{
				int val = data[tos];
				tos--;
				return val;
			}
		}
		
		int top() {
			if(tos == -1) 
			{
				System.out.println("Stack underflow");
				return -1;
			}
			else
			{
				return data[tos];
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		CustomStack st = new CustomStack(n);
		
		System.out.println("Pushing elements 10, 20, 30 onto the stack...");
		st.push(10);
	    st.push(20);
	    st.push(30);
	    
	    System.out.println("Displaying stack:");
	    st.display();
	    
	    System.out.println("Top element is: " + st.top());
	    
	    System.out.println("Popped element is: " + st.pop());
	    
	    System.out.println("Displaying stack after pop:");
	    st.display();
	    
	    System.out.println("Stack size is: " + st.size());
	}
}
