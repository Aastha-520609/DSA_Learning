package gfgPrograms;
import java.util.*;
import java.io.*;
public class minDist {
	public static int minDist(int a[], int n, int x, int y) {
        // code here
        int min = Integer.MAX_VALUE;
        int xI = -1;
        int yI = -1;
        int flag = 0;
        for(int i=0; i<n; i++)
        {
            if(a[i] == x)
            {
                xI = i;
            }
            else if(a[i] == y)
            {
                yI = i;
            }
            if(xI != -1 && yI != -1)
            {
                flag = 1;
                int val = Math.abs(xI - yI);
                if(min > val)
                {
                    min = val;
                }
            }
        }
        if(flag == 0)
        {
            return -1;
        }
        else
        {
         return min;   
        }
    }
	public static void main(String[] args)
	{
	  int[] arr = {1,2,3,2};
	  int n = 4;
	  int x = 1;
	  int y = 2;
	  System.out.println(minDist(arr,n,x,y));
	}
}