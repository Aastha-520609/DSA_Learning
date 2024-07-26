package revision;
import java.util.*;
public class ReverseWors {
	public static String reverseWords(String str) {
		String[] st = str.trim().split("\\s+");
		StringBuilder s = new StringBuilder();
		for(int i=st.length - 1; i>=0; i--) {
				s.append(st[i]);
				if(i > 0) {
					s.append(" ");	
				}
		}
		return s.toString();
	}
	public static String oddNumber(String str) {
		
		for(int i=str.length() - 1; i>=0; i--) {
			char ch = str.charAt(i);
			if(ch % 2 != 0)
			{
				return str.substring(0, i+1);
			}
		}
		return "";
	}
	
	public static String commonPrefix(String[] arr) {
		StringBuilder sb = new StringBuilder();
		
		Arrays.sort(arr);
		
		char[] first = arr[0].toCharArray();
		char[] last = arr[arr.length - 1].toCharArray();

		for(int i=0; i<first.length; i++) {
			if(first[i] != last[i]) {
				break;
			}
			sb.append(first[i]);
		}
		return sb.toString();
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//String str = sc.nextLine();
		//System.out.println(reverseWords(str));
		
		//String odd = sc.next();
		//System.out.println(oddNumber(odd));
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		
		System.out.println(commonPrefix(arr));
	}
}
