package revision;
import java.util.*;
public class IntegerToWords {
	public static HashMap<Integer, String> belowTen = new HashMap<Integer, String>()
    {{
        put(0, "");
        put(1, "One");
        put(2, "Two");
        put(3, "Three");
        put(4, "Four");
        put(5, "Five");
        put(6, "Six");
        put(7, "Seven");
        put(8, "Eight");
        put(9, "Nine");
    }};

    public static HashMap<Integer, String> belowTwenty = new HashMap<Integer, String>()
    {{
        put(10, "Ten");
        put(11, "Eleven");
        put(12, "Twelve");
        put(13, "Thirteen");
        put(14, "Fourteen");
        put(15, "Fifteen");
        put(16, "Sixteen");
        put(17, "Seventeen");
        put(18, "Eighteen");
        put(19, "Nineteen");
    }};

    public static HashMap<Integer, String> belowHundred = new HashMap<Integer, String>()
    {{
        put(2, "Twenty");
        put(3, "Thirty");
        put(4, "Forty");
        put(5, "Fifty");
        put(6, "Sixty");
        put(7, "Seventy");
        put(8, "Eighty");
        put(9, "Ninety");
    }};
    public static String numberToWords(int num) {
    if(num == 0){
        return "Zero";
    }
    if(num < 10){
        return belowTen.get(num);
    }
    if(num < 20){
        return belowTwenty.get(num);
    }
    if(num < 100){
        return belowHundred.get(num/10) + ((num%10 != 0) ? " " + belowTen.get(num%10): "");
    }
    if(num < 1000){
        return numberToWords(num/100) + " Hundred" + ((num%100 != 0) ? " " + numberToWords(num%100) : "");
    }
    if(num < 1000000){
        return numberToWords(num/1000) + " Thousand" + ((num%1000 != 0) ? " " + numberToWords(num%1000) : "");
    }
    if(num < 1000000000){
        return numberToWords(num/1000000) + " Million" + ((num%1000000 != 0) ? " " + numberToWords(num%1000000) : "");
    }
    
    return numberToWords(num/1000000000) + " Billion" + ((num%1000000000 != 0) ? " " + numberToWords(num%1000000000) : "");
    }
    public static void main(String args[]) {
    	int num = 1236789;
    	System.out.println(numberToWords(num));
    }
}
