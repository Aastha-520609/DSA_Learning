package gfgPrograms;
import java.util.*;
public class changeTheStr {
	public static String modify(String s){
        String res = "";
        char ch = s.charAt(0);
        if(Character.isLowerCase(ch))
        {
           res = s.toLowerCase();
        }
        else
        {
            res = s.toUpperCase();
        }
        return res;
    }
	public static void main(String[] args)
	{
		String s = "abCD";
		String res = modify(s);
		System.out.println(res);
	}
	

}
