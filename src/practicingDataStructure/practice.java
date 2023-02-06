package practicingDataStructure;
import java.util.*;
import java.lang.*;
import java.io.*;
public class practice {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter the size of the array (N) [1 to 20]: ");
	    int n = input.nextInt();

	    // Check if the size of the array is within the given range
	    if (n <= 0 || n > 20) {
	      System.out.println("Invalid size of array");
	      return;
	    }

	    char[] charArray = new char[n];
	    System.out.print("Enter " + n + " characters: ");
	    for (int i = 0; i < n-1; i++) {
	      charArray[i] = input.next().charAt(0);
	    }

	    // Check if there are any uppercase characters in the array
	    boolean upperCaseFound = false;
	    for (int i = 0; i < n-1; i++) {
	      if (Character.isUpperCase(charArray[i])) {
	        upperCaseFound = true;
	        break;
	      }
	    }

	    // If no uppercase characters found, display the original array
	    if (!upperCaseFound) {
	      System.out.println("No uppercase characters found. Original array: ");
	      for (int i = 0; i < n-1; i++) {
	        System.out.print(charArray[i] + " ");
	      }
	      System.out.println();
	    } else {
	      // Create a new array to store the lowercase characters
	      char[] resultArray = new char[2 * n];
	      int resultIndex = 0;

	      // Insert lowercase characters after uppercase characters
	      for (int i = 0; i < n-1; i++) {
	        if (Character.isUpperCase(charArray[i])) {
	          resultArray[resultIndex++] = charArray[i];
	          resultArray[resultIndex++] = Character.toLowerCase(charArray[i]);
	        } else {
	          resultArray[resultIndex++] = charArray[i];
	        }
	      }

	      // Display the result array
	      System.out.println("Result array: ");
	      for (int i = 0; i < resultIndex; i++) {
	        System.out.print(resultArray[i] + " ");
	      }
	      System.out.println();
	    }
		
	}

}
