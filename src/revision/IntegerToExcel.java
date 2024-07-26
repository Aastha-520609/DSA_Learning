package revision;
import java.util.Scanner;
public class IntegerToExcel {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StringBuilder columnName = new StringBuilder();
		int n = sc.nextInt();
		
		while(n > 0) {
			n--;
			int remainder = n%26;
		    char ch = (char) ('A' + remainder);
		    columnName.append(ch);
		    n /= 26;
		}
		System.out.println(columnName.reverse());
	}
}
