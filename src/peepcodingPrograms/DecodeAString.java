package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class DecodeAString {
	public static void main(String args[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int[] dpArray = new int[str.length()]; //array which store, in how many ways we can decode a string
		dpArray[0] = 1; //first character of a string will be decoded in only one way
		for(int i=1; i<dpArray.length; i++)
		{
			if(str.charAt(i-1) == '0' && str.charAt(i) == '0') //if last two digits of a string is 0&0 then there is no count since 0 and 00 has no encryption 
			{
				dpArray[i] = 0;
			}
			else if(str.charAt(i-1) == '0' && str.charAt(i) != '0')
			{
				dpArray[i] = dpArray[i-1]; // since we can only take the last value , we cannot take 0 and some value (like 03) because 0 has no encryption
			}
			else if(str.charAt(i-1) != '0' && str.charAt(i) == '0') // the combination of both the digit can only be taken since single 0 has no encryption
			{
				//the combination should be less than 26
				if(str.charAt(i-1) == '1' || str.charAt(i-1) == '2') // since the last number is 0 the second last digit should be either 1 or 2	                                                 
				{
					dpArray[i] = (i >= 2 ? dpArray[i-2] : 1); 
				}
				else
				{
					dpArray[i] = 0;
				}
			}
			else //if both last digits doesn't contain 0 in any place
			{
				if(Integer.parseInt(str.substring(i-1, i+1)) <=26 )
				{
					dpArray[i] = dpArray[i-1] + (i >= 2 ? dpArray[i-2] : 1); //will take sum of two from the back side
				}
				else
				{
					dpArray[i] = dpArray[i-1]; //only last digit will be taken in consideration.
				}
			}
		}
		System.out.println(dpArray[str.length() - 1]);
		
	}

}
