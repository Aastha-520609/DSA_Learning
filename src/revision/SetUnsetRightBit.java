package revision;
import java.util.*;
import java.io.*;
public class SetUnsetRightBit {
	   public static int setBits(int N){
	        // Write your code here.
	        int res = (N | (N + 1));
	        if((N & (N+1)) == 0)
	        {
	            return N;
	        }
	        else
	        {
	            return res;
	        }
	    }
	   public static void main(String[] args)
	   {
		   System.out.println(setBits(5));
	   }

}
