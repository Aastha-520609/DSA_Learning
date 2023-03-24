package gfgPrograms;
import java.util.*;
import java.io.*;
/* Question-
 Given a number and its reverse. Find that number raised to the power of its own reverse.
 Note: As answers can be very large, print the result modulo 109 + 7.
 */
public class PowerOfNumbers {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int R = 0;
		R = (int)reverseNumber(N);
		System.out.println(power(N,R));
	}
	public static long reverseNumber(long N)
	{
		long rev_num = 0;
		while(N > 0)
		{
			rev_num = rev_num * 10 + N % 10;
			N = N / 10;
		}
		return rev_num;
	}
	public static long power(int N,int R)
    {
        //Your code here
        long divisionValue = 1000000007L;
        //Here R is the reversed number which is given as input
        if(R==0)
        {
            return 1;
        }
        if(R==1)
        {
            return N;
        }
        //if the reversed digit is even, power the number with the quotient of reversedigit divided by 2 and 
        //multiply it two times and then print it.
        if(R%2 == 0)
        {
            long temp = power(N,R/2) % divisionValue;
            long result = (temp*temp) % divisionValue;
            return result;
        }
        //if the digit is odd power N with reversed digit -1 and the multiply it with N;
        else
        {
            return (N * power(N, R-1) % divisionValue);
        }
    }

}
