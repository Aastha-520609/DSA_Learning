package gfgPrograms;
import java.util.*;
public class closestString {
	public static int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
            int count1 = -1;
            int count2 = -1;
            int mini = Integer.MAX_VALUE;
            for(int i=0; i<s.size(); i++)
            {
                if(s.get(i).equals(word1))
                {
                    count1 = i;
                }
                if(s.get(i).equals(word2))
                {
                    count2 = i;
                }
                if(count1 != -1 && count2 != -1)
                {
                 mini = Math.min(mini,Math.abs(count1-count2));   
                }
            }
            return mini;
        }
	public static void main(String[] args)
	{
	   ArrayList<String> s = new ArrayList<String>();
	   //Scanner input=new Scanner(System.in);
	   //String a =input.nextLine();
	   
	   s.add(0,"the");
	   s.add(1,"quick");
	   s.add(2,"brown");
	   s.add(3,"fox");
	   s.add(4,"quick");
	   String word1 = "geeks";
	   String word2 = "practice";
	   //closestString ob = new closestString();
	   System.out.print(shortestDistance(s,word1,word2));
	}
}
