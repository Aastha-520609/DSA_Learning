import java.util.Scanner;
public class FibonacciSeries {
     public static void main(String[] args)
     {
    	 Scanner Sc = new Scanner(System.in);
    	 int n = Sc.nextInt();
    	 int front=0,last=1;
    	 int result=front+last;
    	 System.out.println(front);
    	 System.out.println(last);
    	 for(int i=3 ; i<=n ; i++)
    	 {
    		 System.out.println(result);
    		 front=last;
    		 last=result;
    		 result=front+last;
         }
     }   	 
}
