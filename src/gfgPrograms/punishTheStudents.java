package gfgPrograms;
import java.util.*;
public class punishTheStudents {
	public static int shouldPunish (int roll[], int marks[], int n, double avg)
    {
        // your code here
        int count = 0;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(roll[j] > roll[j+1])
                {
                    int temp = roll[j];
                    roll[j] = roll[j+1];
                    roll[j+1] = temp;
                    count++;
                }
            }
        }
        //System.out.println(count);
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            sum = sum + marks[i];
        }
        int temp = (sum - count)/n;
        if(temp > avg)
        {
            return 1;
        }
        return 0;
    }
	public static void main(String[] args)
	{
		int[] roll = {3, 2, 4, 1, 5};
	    int[] marks = {50, 67, 89, 79, 58};
	    int n = 5;
	    double avg = 68;
	    System.out.print(shouldPunish(roll,marks,n,avg));
	}

}
