package revision;
import java.util.*;
public class RemoveParenthesis {
	public static String removeP(String str) {
		Stack<Character> st = new Stack<>();
		StringBuilder s = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			if(ch == '(') 
			{
				if(st.size() > 0) 
				{
					s.append(ch);
				}
				st.push(ch);
			}
			else 
			{
				if(st.size() > 0)
				{
					st.pop();
				}
				if(st.size() > 0)
				{
					s.append(ch);
				}
			}
		}
		return s.toString();
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(removeP(str));
	}
}
