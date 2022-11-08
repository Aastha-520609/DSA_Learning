package peepcodingPrograms;
import java.util.*;
public class stringLearning {
	public static void main(String[] args)
	{
		//we cannot change char of string using charAt like array char.
		//Substrings
		//System.out.println(s.substring(1,3));
		//System.out.println(s.substring(1));
		//Printing all substrings of given string
		String s = "abcd";
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i+1; j<=s.length(); j++)
			{
				System.out.println(s.substring(i,j));
			}
		}
		//split function
		String str = "aastha chaudhary pranjali pandey";
		String[] parts = str.split(" ");
		for(int i=0; i<parts.length; i++)
		{
			System.out.println(parts[i]);
		}
		//Note- Use equals for the comparision in string because the sign (==) doesn't compare string rather it compares address of string
		//Note- Reference is mutable instance is not means we can change whole string but we cannot change,add,delete the char of string
	}

}
