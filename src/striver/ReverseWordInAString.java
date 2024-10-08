package striver;

public class ReverseWordInAString {
	public static void main(String args[]) {
		String str = "the sky is blue";
		String[] s = str.trim().split(" ");
		String rev = "";
		for(int i=s.length - 1; i>=0; i--) {
			rev = rev + s[i];
			if( i != 0) {
				rev = rev + " ";
			}
		}
		
		System.out.print(rev);
	}

}
