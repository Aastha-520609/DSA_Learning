package gfgPrograms;
import java.util.*;
public class ProductIsEvenOrOdd {
	public static int EvenOdd(String n1 , String n2)
    {
        //code here.
        int num1 = n1.charAt(n1.length() - 1);
        int num2 = n2.charAt(n2.length() - 1);
        int num3 = num1*num2;
        if(num3 % 2 == 0)
        {
            return 1;
        }
        return 0;
    }
	public static void main(String[] args)
	{
		String n1 = "15";
		String n2 = " 12";
		int result = EvenOdd(n1,n2);
		System.out.println(result);
	}
}
