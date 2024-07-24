package revision;
import java.util.*;
public class SumOfUniqueElements {
	public static int uniqueElementsSum(int n, int m , int[] arr1, int[] arr2) {
		
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			set1.add(arr1[i]);
		}
		
		for(int i=0; i<m; i++) {
			set2.add(arr2[i]);
		}
		
		HashSet<Integer> uniqueSet1 = new HashSet<>(set1);
		uniqueSet1.removeAll(set2);
		
		HashSet<Integer> uniqueSet2 = new HashSet<>(set2);
		uniqueSet2.removeAll(set1);
		
		int sum = 0;
		for(int val: uniqueSet1) {
			sum += val;
		}
		
		for(int val: uniqueSet2) {
			sum += val;
		}
		
		return sum;
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr1 = new int[n];
		for(int i=0; i<n; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int[] arr2 = new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println(uniqueElementsSum(n, m, arr1, arr2));
	}

}
