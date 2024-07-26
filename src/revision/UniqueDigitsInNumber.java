package revision;
import java.util.*;
public class UniqueDigitsInNumber {
	public static boolean uniqueDigit(int num) {
		boolean[] digitSeen = new boolean[10];
		
		while(num > 0) {
			int lastDigit = num % 10;
			
			if(digitSeen[lastDigit]) {
				return false;
			}
			
			digitSeen[lastDigit] = true;
			num /= 10;
		}
		return true;	
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=s; i<=e; i++) {
			if(uniqueDigit(i)) {
				result.add(i);
			}
		}
		
		for(int num: result) {
			System.out.print(num + " ");
		}
		
	}

}
