import java.io.*;
import java.util.*;
public class matrix {
      public static void main(String args[])
      {
    	  Scanner sc = new Scanner(System.in);
    	  int row = sc.nextInt();
    	  int col = sc.nextInt();
    	  //taking 2d array as input
    	  int[][] array = new int [row][col];
    	  //input for the rows
    	  for(int i=0; i<row; i++)
    	  {
    		  //for coloumn
    		  for(int j=0; j<col; j++)
    		  {
    			  array[i][j] = sc.nextInt();
    		  }
    	  }
    	  //output
    	  for(int i=0; i<row; i++)
    	  {
    		  for(int j=0; j<col; j++)
    		  {
    			  System.out.print("[" + array[i][j] + " " + "]");
    		  }
    	  }
      }
}
