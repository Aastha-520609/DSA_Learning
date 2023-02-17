package oopsConcept;
import java.util.*;
import java.io.*;
public class DetailsOfStudent {
	String name;
	int roll_no;
	DetailsOfStudent(String name, int roll_no)
	{
		this.name = name;
		this.roll_no = roll_no;
	}
	
	public void getDetails()
	{
		System.out.println(name);
		System.out.println(roll_no);
	}
	public static void main(String args[])
	{
		DetailsOfStudent obj = new DetailsOfStudent("Aastha", 72);
		obj.getDetails();
	}
}
