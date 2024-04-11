package revision;
import java.util.*;
import java.io.*;
public class SolveCrossword {
	public static void solution(char[][] arr, String[] words, int idx)
	{
		//if it place all word from words array then
		if(idx == words.length)
		{
			print(arr);
			return;
		}
		//Taking one word from the array of words
		String word = words[idx];
		//Checking in the whole matrix where we can put the word
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				//if the cell is having _ and if the cell is having the first letter of our word then we can place the word
				if(arr[i][j] == '-' || arr[i][j] == word.charAt(0))
				{
					if(canPlacedHorizontally(arr, word, i, j)) {
						boolean[] wePlaced = placeHorizontally(arr, word, i, j);
						solution(arr, words, idx + 1);
						unplaceHorizontally(arr, wePlaced, i, j);
					}
					
					if(canPlacedVertically(arr, word, i, j)) {
						boolean[] wePlaced = placeVertically(arr, word, i, j);
						solution(arr, words, idx + 1);
						unplaceVertically(arr, wePlaced, i, j);
					}
				}
			}
		}
	}
	
	public static boolean canPlacedHorizontally(char[][] arr, String word, int i, int j)
	{
		//if the cell in which we are gonna add char has its left side but in that place there is no + sign, then we cannot add it 
		//to that cell
		//else if the right side of the cell also doesn't have + then words won't be added.
		//we need exact fit for the word, no anyother word to the left or right is allowed
		if(j - 1 >= 0 && arr[i][j-1] != '+')
		{
			return false;
		}
		else if(j + word.length() < arr[0].length && arr[i][j + word.length()] != '+')
		{
			return false;
		}
		
		for(int w = 0; w < word.length(); w++)
		{
			// if word length is greater than the horizontal space
			if(j + w >= arr[0].length)
			{
				return false;
			}
			
			if(arr[i][j+w] == '-' || arr[i][j+w] == word.charAt(w)) 
			{
			  continue;	
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean canPlacedVertically(char[][] arr, String word, int i, int j)
	{
		//if the cell in which we are gonna add char has its left side but in that place there is no + sign, then we cannot add it 
		//to that cell
		//else if the right side of the cell also doesn't have + then words won't be added.
		//we need exact fit for the word, no anyother word to the left or right is allowed
		if(i - 1 >= 0 && arr[i - 1][j] != '+')
		{
			return false;
		}
		else if(i + word.length() < arr.length && arr[i + word.length()][j] != '+')
		{
			return false;
		}
		
		for(int w = 0; w < word.length(); w++)
		{
			// if word length is greater than the horizontal space
			if(i + w >= arr.length)
			{
				return false;
			}
			
			if(arr[i + w][j] == '-' || arr[i + w][j] == word.charAt(w)) 
			{
			  continue;	
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean[] placeHorizontally(char[][] arr, String word, int i, int j)
	{
		//here we check the word is placed by us or its place already, if its placed already we cannot unplace it while backtracking
		// and if its placed by us then we can unplace it. So we have to check this condition.
		boolean[] wePlaced = new boolean[word.length()];
		
		for(int w = 0; w < word.length(); w++)
		{
			if(arr[i][j+w] == '-')
			{
				arr[i][j+w] = word.charAt(w);
				wePlaced[w] = true;
			}
		}
		
		return wePlaced;
	}
	
	public static boolean[] placeVertically(char[][] arr, String word, int i, int j)
	{
		//here we check the word is placed by us or its place already, if its placed already we cannot unplace it while backtracking
		// and if its placed by us then we can unplace it. So we have to check this condition.
		boolean[] wePlaced = new boolean[word.length()];
		
		for(int w = 0; w < word.length(); w++)
		{
			if(arr[i+w][j] == '-')
			{
				arr[i+w][j] = word.charAt(w);
				wePlaced[w] = true;
			}
		}
		
		return wePlaced;
	}
	
	public static void unplaceHorizontally(char[][] arr, boolean[] wePlaced, int i, int j)
	{
		for(int w = 0; w < wePlaced.length; w++)
		{
			if(wePlaced[w] == true)
			{
				arr[i][j+w] = '-';
			}
		}
	}
	
	public static void unplaceVertically(char[][] arr, boolean[] wePlaced, int i, int j)
	{
		for(int w = 0; w < wePlaced.length; w++)
		{
			if(wePlaced[w] == true)
			{
				arr[i+w][j] = '-';
			}
		}
	}
	
	public static void print(char[][] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[10][10];
		for(int i=0; i<arr.length; i++)
		{
			String str = sc.next();
			for (int j = 0; j < arr[i].length; j++) {
			    arr[i][j] = str.charAt(j);
			}
		}
		
		int n = sc.nextInt();
		String[] words = new String[n];
		for(int i=0; i<words.length;  i++)
		{
			words[i] = sc.next();
		}
		solution(arr, words, 0);
	}
}
