package revision;
public class countGoodNumbers {
	private long MOD = 1_000_000_007;
    public int countNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        long first = pow(5, even)%MOD; //5 even numbers between 0-9
        long second = pow(4, odd)%MOD; // 4 prime numbers between 0-9
        return (int)((first*second)%MOD);
    }

    public long pow(long x, long n)
    {
        if(n == 0)
        {
            return 1;
        }
        
        long temp = pow(x, n/2);
        
        if(n%2 == 0)
        {
            return (temp*temp) % MOD;
        }
        else
        {
            return (x*temp*temp) % MOD;
        }
    }
    
    public static void main(String args[])
    {
    	countGoodNumbers solution = new countGoodNumbers();

        long n1 = 5;
        long n2 = 10;
        long n3 = 15;

        int count1 = solution.countNumbers(n1);
        int count2 = solution.countNumbers(n2);
        int count3 = solution.countNumbers(n3);

        System.out.println("Count of good numbers for n = " + n1 + ": " + count1);
        System.out.println("Count of good numbers for n = " + n2 + ": " + count2);
        System.out.println("Count of good numbers for n = " + n3 + ": " + count3);
    }
}
