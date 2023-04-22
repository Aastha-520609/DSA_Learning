package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class CountSpecialSubsequences {
	public static void main(String args[])
	{
		//In this question, the subSequence which we are going to count will be special, the subsequence should follow this order abc means b should be followed by a and 
		//c should be followed by b, if there are more than one a or b or c, then all a should be together than b should come similary c i.e a+b+c+,
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();  //Str whose subSequence you want to print
		
		//Initially there will be no subsequence
		int a = 0;
		int ab = 0;
		int abc = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch == 'a')
			{
				a = (2 * a) + 1; //with previous a, this a will have two choices it can be present after the previous a or not, should 2 * a is done, +1 is done because it 
				               // can be present alone too.
			}
			else if(ch == 'b')
			{
				//in this b have two choices it can come with ab or not, so 2 * ab is done, +a is done because after all a's series b can come because subsequence is of
				//pattern abc.
				ab = (2 * ab) + a; 
			}
			else if(ch == 'c')
			{
				//similarly, in this c also have two choices it can either come with ab or not, so 2 *abc, +ab is done beacause after all ab's series c can come.
				abc = (2 * abc) + ab;
			}
		}
		System.out.println(abc);
	}

}
