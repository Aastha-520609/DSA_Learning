package oopsConcept;
import java.util.*;
import java.io.*;
public class EmployeeDetails {
	int salary, hours_worked;
	
	EmployeeDetails()
	{
		salary = 0;
		hours_worked = 0;
	}
	
	public void getInfo(int salary, int hours_worked)
	{
		this.salary = salary;
		this.hours_worked = hours_worked;
	}
	
	public void addSalary()
	{
		if(salary < 500)
		{
			salary += 10;
		}
	}
	
	public void addWork()
	{
		if(hours_worked > 6)
		{
			hours_worked += 5;
		}
	}
	
	public void display()
	{
		System.out.println(salary);
		System.out.println(hours_worked);
	}
	
	public static void main(String args[])
	{
	   	Scanner sc = new Scanner(System.in);
	   	int salary = sc.nextInt();
	   	int hours_worked = sc.nextInt();
	   	
	   	EmployeeDetails obj = new EmployeeDetails();
	   	obj.getInfo(salary, hours_worked);
	   	obj.addSalary();
	   	obj.addWork();
	   	obj.display();
	}
}
