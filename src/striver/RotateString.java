package striver;

public class RotateString {
	 public static boolean rotateString(String s, String goal) {
		 if(s.length() != goal.length()) {
			 return false;
		 }
		 
	     String concat = s + s;
	     if(concat.contains(goal)) {
	    	 return true;
	     }
	     
	     return false;
	    }
	public static void main(String args[]) {
		String real = "gcmbf";
		String goal = "fgcmb";
		System.out.println(rotateString(real, goal));
	}

}
