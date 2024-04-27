package revision;
import java.util.*;
import java.io.*;
public class MinBitsToFlipNumber {
	 public static int minBitFlips(int start, int goal) {
	        int ans = start ^ goal;
	        int count = 0;
	        for(int i=0; i<31; i++)
	        {
	            if((ans&(1 << i)) != 0)
	            {
	                count++;
	            }
	        }
	        return count;
	    }
	public static void main(String[] args)
	{
		System.out.println(minBitFlips(10,7));
	}
}
