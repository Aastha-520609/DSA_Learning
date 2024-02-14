package revision;
public class RotateString {
	public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
        {
            return false;
        }
        String res = s + s;
        if(res.contains(goal))
        {
            return true;
        }
        return false;
    }
	public static void main(String args[])
	{
		String s = "abcde";
		String goal = "cdeab";
		System.out.println(rotateString(s,goal));
	}
}
