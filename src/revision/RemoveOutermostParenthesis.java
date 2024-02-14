package revision;
import java.util.*;
public class RemoveOutermostParenthesis {
	public static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(' )
            {
              if(st.size() > 0)
              {
                  str.append(ch);
              }
              st.push(ch);
            }
            else
            {
                st.pop();
                if(st.size() > 0)
                {
                    str.append(ch);
                }
            }
        }
        return str.toString();
    }
	public static void main(String args[])
	{
		String str = "(()())(())";
		System.out.print(removeOuterParentheses(str));
	}
}
