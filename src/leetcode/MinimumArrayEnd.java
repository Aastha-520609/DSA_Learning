package leetcode;
public class MinimumArrayEnd {
	public static long minEnd(int n, int x) {
        long num = x;
        for(int i=1; i<n; i++){
             num = (num + 1) | x;
        }
        return num;
    }
	public static void main(String args[]) {
		int n = 3;
		int x = 4;
		System.out.println(minEnd(n,x));
	}
}
