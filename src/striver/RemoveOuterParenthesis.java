package striver;
import java.util.Stack;

public class RemoveOuterParenthesis {
	public static void main(String args[]) {
		String s = "(()())(())";
		Stack<Character> stack = new Stack<>();
		String ans = "";
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == '(') {
				stack.push(ch);
			}
			else if(ch == ')') {
				if(stack.peek() == '(') {
					char val = stack.pop();
					if(stack.size() > 0) {
						ans = ans + val + ch;
					}
				}
			}
		}
		
		System.out.println(ans);
	}
}
