package striver;

public class SwapWithoutThirdVariable {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		
		//a = a + b; // a becomes 30
		//b = a - b; // b becomes 10
		//a = a - b; // a becomes 20
		
		//Now using xor operation
		
		//The XOR (Exclusive OR) operation is a bitwise operator that compares two bits. 
		//It outputs 1 if the bits are different and 0 if the bits are the same.
		//if 0 0 then result is 0, similarly if 1 1 then result is 0.
		//if 0 1 then result is 1, similarly if 1 0 then result is 1.
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		//Properties of XOR
		//x ^ x = 0 for any x (XOR-ing a number with itself results in 0).
		//x ^ 0 = x (XOR-ing a number with 0 leaves it unchanged).
		//x ^ y = y ^ x (the order of XOR doesn't matter).
		//(x ^ y) ^ z = x ^ (y ^ z) (grouping of XOR operations doesn't affect the result).
		
		System.out.println(a);
		System.out.println(b);
	}
}
