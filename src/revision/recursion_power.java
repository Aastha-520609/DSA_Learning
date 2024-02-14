package revision;
public class recursion_power {
	public static int power(int n, int p)
	{
		if(p == 0)
		{
			return 1;
		}
		
		return n * power(n, p-1);
	}
	public static void main(String args[])
	{
		int number = 2;
		int power = 3;
		System.out.print(power(number,power));
	}

}
