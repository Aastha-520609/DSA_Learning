package revision;
import java.util.*;
public class UniqueElemInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		
		int count = 0;
		for(int i=s; i<=e; i++) {
			int currentNumber = i;
			
			while(currentNumber > 0) {
				int lastDigit = currentNumber % 10;
				
				if(lastDigit == k) {
					count++;
				}
				
				currentNumber = currentNumber / 10;
			}	
		}
		
		System.out.println(count);
	}

}
