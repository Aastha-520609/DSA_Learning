package peepcodingPrograms;
import java.util.*;
import java.io.*;
/* Given n as number of friends
 * each friend can remain single or pair up with any of its friends.
 * print the number of ways in which these friends can stay single or pair up.*/
public class FriendsPairingProblem {
     public static void main(String args[])
     {
    	 Scanner sc = new Scanner(System.in);
    	 int n = sc.nextInt(); //no of friends.
    	 
    	 int[] resultantArray = new int[n+1];
    	 
    	 resultantArray[1] = 1; // one single friend can be only single.
    	 resultantArray[2] = 2; //two friends can either pair up or stay single i.e 2 ways.
    	 
    	 for(int i=3; i<=n; i++)
    	 {
    		 //if 4 friends are taken suppose (1234) then 1 can remain single or pair up with its other friend.
    		 //1 remains single so we have to calculate the count of other three friends i.e (n-1)
    		 //1 pairs up, it pairs up with other friend except himself so (n-1) , as it pairs up with all three friends, that particular
    		 //pair will calculate the count of other remaining i.e(n-2).
    		 resultantArray[i] = resultantArray[i-1] + resultantArray[i-2] * (i-1); //we only need combination of friends not permutation.
    	 }
    	 
    	 System.out.println(resultantArray[n]);
     }
}
