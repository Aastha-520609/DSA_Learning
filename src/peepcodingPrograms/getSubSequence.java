package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class getSubSequence {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> res = gss(str);
		System.out.println(res);
	}
    public static ArrayList<String> gss(String str)
    {
    	if(str.length() == 0)
    	{
    		ArrayList<String> blankWay = new ArrayList<>();
    		blankWay.add("");
    		return blankWay;
    	}
    	char ch = str.charAt(0); // a
    	String rem_ch = str.substring(1); //bc
    	ArrayList<String> recursion_result = gss(rem_ch); // have faith that this will provide --,-c,b-,bc
    	
    	ArrayList<String> result  = new ArrayList<>();
    	for(String recursion_str: recursion_result)
    	{
    		result.add(""+ recursion_str); 
    		result.add(ch+ recursion_str);
    	}
    	return result;
    }
}
