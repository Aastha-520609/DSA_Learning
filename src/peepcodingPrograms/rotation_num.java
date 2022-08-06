import java.util.Scanner;
public class rotation_num {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		System.out.println("Enter the number of rotation you want: ");
		int k = sc.nextInt();
		int num = n;
		int count = 0;
		//This counts the digit of a number
		while(num!=0)
		{
			num = num/10;
			count++;
		}
		k = k % count; // if k has greater value it will help to make it shorter i.e exact rotation to be worked on 
		// if k has negative value 
		if(k<0)
		{
			//instead of shifting the first value to the last 
			//we can shift last values to the first 
			// in this way we can do it in positive way only 
			k = k + count;
			// if we take k value as -2 here 
			//-2 + 5 (if no of digit is 5 ) will become 3 
			// then we will shift last 3 numbers to the first by the following code
		}
		int div = 1;
		int mul = 1;
				for(int i = 1;i<=count;i++)
				{
					if(i<=k)
					{
						div = div * 10;
					}
					else
					{
						mul = mul * 10;
					}
				}
				int q = n / div ;
				int r = n % div ;
				
				int rot_num = r * mul + q;
				System.out.println(rot_num);
	}

}
