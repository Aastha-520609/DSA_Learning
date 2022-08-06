import java.util.Scanner;
public class gcd {
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   int a = sc.nextInt();
	   int b = sc.nextInt();
	   
	   int org_a = a;
	   int org_b = b;
	  while(a%b!=0)
	  {
		  int rem = a % b;
		  a=b;
		  b=rem;
	  }
	  int gcd = b;
	  System.out.println("Gcd is: " + gcd);
	  
	  int Lcm = (org_a*org_b)/gcd;
	  System.out.println("Lcm is : " +Lcm);
   }
}
