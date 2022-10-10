package gfgPrograms;
import java.util.*;
public class sortTheWay {
	public static int isPossible (int per[], int vac[], int n)
    {
        // your code here
        Arrays.sort(per);
        Arrays.sort(vac);
        for(int i=0; i<n; i++)
        {
            if(vac[i] < per[i])
            {
                return 0;
            }
        }
        return 1;
    }
	public static void main(String[] args)
	{
		int[] per = {100,328,248,689,200};
		int[] vac = {123,146,454,542,456};
		int n = 5;
		System.out.print(isPossible(per,vac,n));
	}
}
