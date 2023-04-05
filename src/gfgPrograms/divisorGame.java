package gfgPrograms;
import java.util.*;
import java.io.*;
/*Question-
 * Alice and Bob take turns playing a game, with Alice starting first.
Initially, there is a number N on the chalkboard. On each players's turn, that player makes a move consisting of:
Choosing any x with 0 < x < N  and  N % x == 0.
Replacing the number N on the chalkboard with N - x.
Also, if a player cannnot make a move, they lose the game.
Return true if and only if Alice wins the game, assuming both players play optimally.*/
public class divisorGame {
	public static boolean divisorGame(int N) {
	    // code here
	    if(N % 2 == 0)
	    {
	        return true;
	    }
	    return false;
	  }
	public static void main(String args[])
	{
		int N = 2;
		System.out.println(divisorGame(N));
	}

}
