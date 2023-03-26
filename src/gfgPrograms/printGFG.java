package gfgPrograms;
import java.util.*;
import java.io.*;
public class printGFG {
	public static void printGfg(int N) {
        // code here
        if(N == 0)
        {
            return;
        }
        System.out.print("GFG" + " ");
        printGfg(N-1);
    }
	public static void main(String args[])
	{
		int N = 10;
		printGfg(N);
	}

}
