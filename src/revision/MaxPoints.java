package revision;
import java.util.*;
import java.io.*;
public class MaxPoints {
	public static int maxScore(int[] cardPoints, int k) {
        int rsum = 0, lsum = 0, maxsum = 0;
        for(int i=0; i<k; i++)
        {
            lsum = lsum + cardPoints[i];
        }
        maxsum = lsum;

        int rindex = cardPoints.length - 1;
        for(int i=k-1; i>=0; i--)
        {
            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[rindex];
            rindex = rindex - 1;
            maxsum = Math.max(maxsum, lsum + rsum);
        } 
        return maxsum;
    }
	public static void main(String[] args)
	{
		int[] cardPoints = new int[] {1,2,3,4,5,6,1};
		int k = 3;
		System.out.println(maxScore(cardPoints, k));
	}
}
