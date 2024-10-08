package striver;

public class LargestOddNumberInAString {
	public static void main(String args[]) {
		String num = "32457";
		boolean founded = false;
		
		for(int i=num.length()-1; i>=0; i--) {
			char ch = num.charAt(i);
			if(ch % 2 != 0) {
				System.out.println(num.substring(0,i+1));
				founded = true;
				break;
			}
		}
		
		if(!founded) {
			System.out.println("Not valid String");
		}
	}

}
