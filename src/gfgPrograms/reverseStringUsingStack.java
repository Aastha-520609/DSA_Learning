package gfgPrograms;
import java.util.*;
import java.io.*;
public class reverseStringUsingStack {
	 public static String reverse(String S){
	        //code here
	        Stack<Character> st = new Stack<Character>();
	        for(int i=0; i<S.length(); i++)
	        {
	            char ch = S.charAt(i);
	            st.push(ch);
	        }
	        String res = "";
	        for(int i=0; i<S.length(); i++)
	        {
	            res = res + st.pop();
	        }
	        return res;
	    }
	 public static void main(String[] args)
	 {
		String S = "GeeksForGeeks";
		System.out.println(reverse(S));
	 }

}
