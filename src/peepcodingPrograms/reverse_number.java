package peepcodingPrograms;

import java.util.Scanner;
public class reverse_number {
       public static void main (String[] args)
       {
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Enter any number: ");
    	   int n = sc.nextInt();
    	   int rem =0;
    	   while(n!=0)
    	   {
    		   rem=n%10;
    		   System.out.println(rem);
    		   
    		   n=n/10;
    		   
    	   }
    	   
       }
}
