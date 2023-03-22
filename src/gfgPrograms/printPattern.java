package gfgPrograms;
import java.util.*;
import java.io.*;
public class printPattern {
	static List<Integer> pattern(int N){
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        check(list,N);
        return list;
        
    }
    public static void check(ArrayList<Integer> list, int n)
    {
        if(n<=0)
        {
           list.add(n);
           return;
        }
        if(n>=0)
        {
            list.add(n);
            check(list,n-5);
            list.add(n);
        }
    }
    
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	System.out.print(pattern(n));
    }
}
