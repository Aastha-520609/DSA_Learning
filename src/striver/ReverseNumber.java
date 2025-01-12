package striver;

public class ReverseNumber {
	 public static int reverse(int x) {
	        int reversed = 0;
	        while(x != 0){
	            int digit = x % 10;
	            x /= 10;


	            if(reversed > 0 && reversed > (Integer.MAX_VALUE - digit) / 10){
	                return 0;
	            }

	            if(reversed < 0 && reversed < (Integer.MIN_VALUE - digit) / 10){
	              return 0;
	            }

	            reversed = reversed * 10 + digit; 
	        }
	        return reversed;
	 }
	public static void main(String args[]) {
		int x = 120;
		System.out.println(reverse(x));
	}
}
