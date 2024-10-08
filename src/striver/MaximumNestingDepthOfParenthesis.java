package striver;

public class MaximumNestingDepthOfParenthesis {
	public static void main(String args[]) {
		String s = "(1+(2*3)+((8)/4))+1";
		int max = 0;
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == '(') {
				count++;
				if(count > max) {
					max = count;
				}
			}
			else if(ch == ')') {
				count--;
			}
		}
		
		System.out.println(max);
	}
}
