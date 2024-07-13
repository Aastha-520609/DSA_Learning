package revision;
import java.util.*;
import java.io.*;
public class robotsCollision {
	public static List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer[] indices = new Integer[n];
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++)
        {
            indices[i] = i;
        }

        Arrays.sort(indices, (left, right) -> Integer.compare(positions[left], positions[right]));

        for(int currentIndex: indices)
        {
            if(directions.charAt(currentIndex) == 'R')
            {
                stack.push(currentIndex);
            }
            else
            {
                while(!stack.isEmpty() && healths[currentIndex] > 0)
                {
                    int topIndex = stack.pop();
                    if(healths[topIndex] > healths[currentIndex])
                    {
                        healths[topIndex] -= 1;
                        healths[currentIndex] = 0;
                        stack.push(topIndex);
                    }
                    else if(healths[topIndex] < healths[currentIndex])
                    {
                        healths[currentIndex] -= 1;
                        healths[topIndex] = 0;
                    }
                    else
                    {
                        healths[currentIndex] = 0;
                        healths[topIndex] = 0;
                    }
                }
            }
        }

        for(int i=0; i<n; i++)
        {
            if(healths[i] > 0)
            {
                result.add(healths[i]);
            }
        }

        return result;
    }
	
	public static void main(String args[])
	{
		int[] positions = {3,5,2,6};
		int[] healths = {10,10,15,12};
		String directions = "RLRL";
		System.out.println(survivedRobotsHealths(positions, healths, directions));
	}
}
