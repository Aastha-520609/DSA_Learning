import java.util.Scanner;
import java.lang.Math;
public class Digits {
     public static void main(String[] args)
     {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter any number: ");
    	 int n = sc.nextInt();
    	 int count = 0;
    	 int num = n;
    	 while(num != 0)
    	 {
    		 num = num/10;
    		 count++;
    	 }
    	 System.out.println("Total count of a number is: "+count);
    	 System.out.println("Digits of the number are:");
    	 int div = (int)Math.pow(10, count-1);
    	 while(div != 0)
    	 {
    		int q = n/div;
    		System.out.println(q);
    		
    		//remainder(updation)
    		n = n % div; //here n will be the remainder number as it updates
    		
    		//div also gets updated it becomes 1 less 0
    		div = div/10;
    		
    	 }
     }
}
