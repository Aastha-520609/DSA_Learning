package gfgPrograms;
import java.util.*;
public class implementStrStr {
	public static int strstr(String s, String x)
    {
       // Your code here
       for(int i=0; i<=s.length()-x.length(); i++)
       {
           int j = 0;
           for( j=0; j<x.length(); j++)
           {
               if(s.charAt(i+j) != x.charAt(j))
               {
                   break;
               }
           }
           if( j == x.length())
           {
               return i;
           }
       }
       return -1;
    }
	public static void main(String[] args)
	{
	  String s1 = "GeeksForGeeks";
	  String s2 = "Fr";
	  System.out.print(strstr(s1,s2));
	}
}
