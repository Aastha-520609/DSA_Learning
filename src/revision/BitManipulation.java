package revision;
import java.util.*;
import java.io.*;
public class BitManipulation {
	public static int[] bitManipulation(int num, int i){
        int value = (num & (1 << i-1)) == 0 ? 0 : 1;
        int set = (num | (1 << i-1));
        int clear = (num & (~(1 << i-1)));
        int[] solution = new int[]{value, set, clear};
        return solution;
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = sc.nextInt();
		int[] arr = bitManipulation(n,i);
		for(int k=0; k<arr.length; k++)
		{
			System.out.print(arr[k] + " ");
		}
	}
}
