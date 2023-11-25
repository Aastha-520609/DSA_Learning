package revision;
import java.util.*;
import java.io.*;
public class majorityElementUsingMooreVotingAlgo {
	public static List< Integer > majorityElement(int []v) { 
        int count1 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int count2 = 0;
        for(int i=0; i<v.length; i++)
        {
           if(count1 == 0 && v[i] != ele2)
           {
               count1 = 1;
               ele1 = v[i];
           }
           else if(count2 == 0 && v[i] != ele1)
           {
               count2 = 1;
               ele2 = v[i];
           }
           else if(ele1 == v[i])
           {
               count1++;
           }
           else if(ele2 == v[i])
           {
               count2++;
           }
           else{
              count1--;
              count2--;
           }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for(int i=0; i<v.length; i++)
        {
           if(v[i] == ele1 )
           {
               count1++;
           } 
           if(v[i] == ele2 )
           {
               count2++;
           }
        } 

        //since max element greater than n/3 would be 2 only
        int min = (int)(v.length/3) + 1;

        if(count1 >= min)
        {
            list.add(ele1);
        }
        if(count2 >= min)
        {
            list.add(ele2);
        }

        return list;
    }
	public static void main(String args[])
	{
		int[] array = {1,1,1,2,2,2};
		System.out.println(majorityElement(array));
	}
}
