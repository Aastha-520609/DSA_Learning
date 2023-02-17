package oopsConcept;
import java.util.*;
import java.io.*;
public class AreaOfRectangle {  
		int length, breadth;
		public void setDim(int length, int breadth)
		{
			this.length = length;
			this.breadth = breadth;
		}
		
		public int getArea()
		{
			return(length * breadth);
		}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		//Creating object
		AreaOfRectangle obj = new AreaOfRectangle();
		obj.setDim(length,breadth);
		System.out.println("Area is: "+ obj.getArea());		
	}
}
