package peepcodingPrograms;
import java.util.*;
public class stringBuilder {
	public static void main(String[] args)
	{
		//It is mutable unlike string
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);
		char ch = sb.charAt(0);
		System.out.println(ch);
		//sb.setCharAt(0, 'd');
		//System.out.println(sb);
		sb.insert(0, "aastha ");
		sb.deleteCharAt(1);
		//to add in last
		sb.append(" ji");
		System.out.println(sb);
		System.out.println(sb.length());
		
	}

}
