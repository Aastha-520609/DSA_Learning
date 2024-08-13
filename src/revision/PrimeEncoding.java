package revision;
import java.util.*;
public class PrimeEncoding {
	public static String processStudents(String str) {
		boolean[] isPrime = new boolean[127];
		//firstly mark all number except 0 and 1 as true
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		
		for(int i = 2; i*i < 127; i++) {
			if(isPrime[i]) {
				for(int j = i*i; j < 127; j += i) {
					isPrime[j] = false;
				}
			}
		}
		
		List<Character> primeChars = new ArrayList<>();
		List<Character> compositeChars = new ArrayList<>();
		
		for(char ch : str.toCharArray()) {
			if(isPrime[ch]) {
				primeChars.add(ch);
			}else {
				compositeChars.add(ch);
			}
		}
		
		Collections.sort(primeChars);
		compositeChars.sort(Collections.reverseOrder());
		
		StringBuilder result = new StringBuilder();
		for(char ch: primeChars) {
			result.append(ch);
		}
		for(char ch: compositeChars) {
			result.append(ch);
		}
		
		return result.toString();
	}
	public static void main(String args[]) {
		String str = "Kkunjkhahorin";
		System.out.println(processStudents(str));	
	}
}
