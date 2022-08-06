/*import java.util.Scanner;
public class primeNumbers {
         public static void main(String[] args)
         {
        	 Scanner sc = new Scanner(System.in);
        	 System.out.println("Enter the number till where you want to get prime number:");
        	 int n = sc.nextInt();
        	 //Conditions of prime 
             for(int i=1;i<=n;i++) { //here i loop is to run from 1 to n times
            	 int count = 0; 
            	 for(int j=1;j<=n;j++) { //j loop is to check all the numbers 
                    	if( i%j == 0)
                    		 {
                    			count++; 
                    		 }
                    	 }
                    	 if(count==2) {
                    		 System.out.println("The number " +i+ " is a prime number");
                    	 }
                    	 else
                    	 {
                    		 System.out.println("The number " +i+ " is not a prime number");
                    	 } 
        	 }		
         }
}*/
import java.util.Scanner;
public class primeNumbers {
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number from where you want to get prime numbers");
		int low = scn.nextInt();
		System.out.println("Enter the number till where you want to get prime numbers");
		int high = scn.nextInt();
		for(int i=low;i<=high;i++)
		{
			int count = 0;
			for(int j=2;j<=i;j++)
			{
			   if(i%j == 0)
			   {
				   count++;
				   break;
			   }
			}
			
			if(count == 0){
				  System.out.println(i);
			   }
		}
	}
}
