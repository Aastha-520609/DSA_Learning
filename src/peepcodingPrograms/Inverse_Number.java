import java.util.Scanner;
import java.lang.Math;

public class Inverse_Number {
       public static void main (String[] args)
       {
    	   Scanner sc = new Scanner (System.in);
    	   System.out.println("Enter any number: ");
    	   int org_num = sc.nextInt();
    	   int original_pla=1;
    	   int inverse_num=0;
    	   while(org_num!=0)
    	   {
    		   int original_digit  = org_num%10;
    		   int inv_pla = original_digit;
    		   int inv_digit = original_pla;
    		   
    		   inverse_num = inverse_num + inv_digit * (int) Math.pow(10,inv_pla-1);
    		   
    		   org_num=org_num/10;
    		   original_pla++;
    	   }
    	   System.out.println(inverse_num);
       }
}
	