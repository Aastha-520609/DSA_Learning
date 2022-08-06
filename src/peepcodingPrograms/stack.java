import java.util.*;
public class stack {
	public static void main(String[] args)
	{
		//declaring stack
		Stack<Integer> st = new Stack<>();
		
		st.push(10);
		st.push(20);
		System.out.println(st);
		st.push(30);
		System.out.println(st);
	    st.pop();
	    System.out.println(st);
	    System.out.println(st.peek()+ " "+st.size());
	}

}
