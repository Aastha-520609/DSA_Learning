package gfgPrograms;
import java.util.*;
public class LastIndexOfOne {
	static int lastIndex(String s) {
        for(int i=s.length()-1 ; i>=0; i--)
        {
            if(s.charAt(i) == '1')
            {
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args)
	{
	  String s = "1111111111";
	  int index = lastIndex(s);
	  if(index == -1)
	  {
		  System.out.println("Character not found");
	  }
	  else
	  {
		  System.out.println("Character found at index "+ index);
	  }
	}
}
