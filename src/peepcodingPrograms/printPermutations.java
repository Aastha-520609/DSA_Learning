package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class printPermutations {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		displayPermutations(str, "");
	}
    public static void displayPermutations(String question, String answer)
    {
    	//if the question string is empty, all the possible permutation is saved to answer.
    	if(question.length() == 0)
    	{
    		System.out.println(answer);
    		return;
    	}
    	for(int i=0; i<question.length(); i++)
    	{
    		char ch = question.charAt(i);
    		//it stores all the left element of a string from the given index (Suppose we have a string abcde and our index is at c so, it stores 
    		//left of c i.e ab using substring function.
    		String leftPart = question.substring(0,i);
    		// is stores all the right element of a string from the given index
    		String rightPart = question.substring(i+1);
    		//for string abc at index a, there is no element in leftPart and for rightpart bc is the elem, so restofquestion is bc.
    		String restOfQuestion = leftPart + rightPart; 
    		displayPermutations(restOfQuestion, answer + ch);
    	}
    }
}
