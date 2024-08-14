package revision;
public class NetWorth {
	public static int calculateWorth(int n, int[] arr, int mod) {
		int netWorth = 0;
		for(int i=0; i<n; i++) {
			int sum = 0;
			
			if(i-1 >= 0) {
				sum += arr[i-1];
			}
			if(i-2 >= 0) {
				sum += arr[i-2];
			}
			if(i-3 >= 0) {
				sum += arr[i-3];
			}
			
			sum += arr[i];
			
			netWorth += sum;
		}
		
		return netWorth % mod;
	}
	public static void main(String args[]) {
		int n = 5;
		int[] arr = {1,2,3,4,5};
		int mod = 100;
		System.out.println(calculateWorth(n,arr,mod));
	}
}
