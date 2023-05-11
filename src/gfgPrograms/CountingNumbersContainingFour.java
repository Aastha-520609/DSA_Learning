package gfgPrograms;
import java.util.*;
import java.io.*;
public class CountingNumbersContainingFour {
	public static int countNumberswith4(int N) {
        // code here
        int count = 0;
        for(int i=0; i<=N; i++)
        {
            String str = String.valueOf(i);
            if(str.contains("4"))
            {
                count++;
            }
        }
        return count;
    }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countNumberswith4(n));
	}
}
