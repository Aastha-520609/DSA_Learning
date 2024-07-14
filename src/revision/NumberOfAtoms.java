package revision;
import java.util.*;
import java.io.*;
public class NumberOfAtoms {
	public static String countOfAtoms(String formula) {
        int n = formula.length();
        //Create a stack of maps
        Stack<Map<String, Integer>> stack = new Stack<>();
        //initially place an empty hashmap in the stack
        stack.push(new HashMap<>());

        int i=0;
        while(i<n)
        {
            if(formula.charAt(i) == '(')
            {
                stack.push(new HashMap<>());
                i++;
            }
            else if(formula.charAt(i) == ')')
            {
                //pop the topmost element, multiply with the multiplier and then again push it back to the stack
                Map<String, Integer> top = stack.pop();
                i++;
                
                //check if there exists any multiplier after closing parenthesis
                int multiplier = 1;
                int start= i; //Record the current position to find the start of the digits (if any) after the parenthesis
                while(i<n && Character.isDigit(formula.charAt(i)))
                {
                    i++;  // Move i to the end of the digits
                }

                if(start < i) // if multiplier found
                {
                    multiplier = Integer.parseInt(formula.substring(start, i));  // Parse the digits as an integer
                }

                //multiplying multiplier with the value of elements
                for(String element: top.keySet())
                {
                    int count = top.get(element) * multiplier;
                    //merge it into previous map
                    stack.peek().put(element, stack.peek().getOrDefault(element, 0) + count);
                }
            }
            else
            {
                int start = i;
                i++;
                while(i<n && Character.isLowerCase(formula.charAt(i)))
                {
                    i++;
                }

                String element = formula.substring(start, i);

                int multiplier = 1;
                start = i; //Record the current position to find the start of the digits (if any) after the substring
                while(i<n && Character.isDigit(formula.charAt(i)))
                {
                    i++;  // Move i to the end of the digits
                }

                if(start < i) // if multiplier found
                {
                    multiplier = Integer.parseInt(formula.substring(start, i));  // Parse the digits as an integer
                }

                stack.peek().put(element, stack.peek().getOrDefault(element, 0) + multiplier);
            }
        }


        Map<String, Integer> result = stack.pop();
        List<String> elements = new ArrayList<>(result.keySet());
        Collections.sort(elements);

        StringBuilder str = new StringBuilder();
        for(String val: elements)
        {
            str.append(val);
            int count = result.get(val);
            if(count>1)
            {
                str.append(count);
            }
        }
        
        return str.toString();
    }
	
	public static void main(String args[])
	{
		String str = "K4(ON(SO3)2)2";
		System.out.println(countOfAtoms(str));
	}

}
