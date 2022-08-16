package peepcodingPrograms;

import java.util.*;
public class FascinatingNumber {
	public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter any number: ");
	 int n = sc.nextInt();
	 int count = 0;
	 int n2=1,n3=1;
	 int num = n;
	 while(n != 0)
	 {
		n = n/10;
		count++;
	 }
	 System.out.println(count);
	 if(count<=2)
	 {
		System.out.println("Not Sufficient digit");  
	 }
	 else
	 {
		 n2 = num * 2;
		 n3 = num * 3;
	 }
	 String s = Integer.toString(num);
	 String s1 = Integer.toString(n2);
	 String s2 = Integer.toString(n3);
	 String total = s+s1+s2;
	 System.out.println(total);
	 boolean found = true;
	 for(char c = '1'; c <= '9'; c++)
	 {
		 int count1 =0;
		 for(int i=0; i<total.length(); i++)
		 {
			 char ch = total.charAt(i);
			 if(ch == c)
			 {
				 count1++;
			 }
		 }
		 if(count1 != 1)
		 {
			 found = false;
			 break;
		 }
	 }
	 if(found)
	 {
		 System.out.println("IS a fascinating number");
	 }
	 else
	 {
		 System.out.println("Not a fascinating number");
	 }
	}
	
}
