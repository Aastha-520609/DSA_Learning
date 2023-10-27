package revision;

public class palindromeArray {
	public static int palinArray(int[] a, int n)
    {
        int i;
         for(i=0; i<n; i++)
            {
               int number = a[i];
               int revNum = 0;
               while(number != 0)
               {
                 int digit = number % 10;
                 revNum = revNum * 10 + digit;
                 number = number / 10;
               }
               
               if(a[i] != revNum)
               {
                   return 0;
               }
            }
            return 1;
    }
	public static void main(String args[])
	{
		int[] array = {111,222,333,444,555};
		int n = array.length;
		int result = palinArray(array,n);
		System.out.println(result);
	}

}
