import java.util.*;
class Complex{
	float real;
	float imaginary;
	Complex(){
		
	}
	Complex(float r, float i)
	{
		this.real = r;
		this.imaginary = i;
	}
	Complex getSum(Complex c2)
	{
		Complex res = new Complex();
		
		res.real = real + c2.real;
		res.imaginary = imaginary + c2.imaginary;
		
		return(res);
	}
	Complex getDifference(Complex c2)
	{
        Complex res = new Complex();
		
		res.real = real - c2.real;
		res.imaginary = imaginary - c2.imaginary;
		
		return(res);
	}
	Complex getProduct(Complex c2)
	{
        Complex res = new Complex();
		
		res.real = real * c2.real;
		res.imaginary = imaginary * c2.imaginary;
		
		return(res);
	}
	void display()
	{
		System.out.println(real+" +i" + imaginary);
	}
}
public class classandobject {
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter any real number: ");
	  int real = sc.nextInt();
	  System.out.println("Enter any imaginary number: ");
	  int img = sc.nextInt();
	  
	  //creating objects
	  Complex c1 = new Complex();
	  c1.display();
	  
	  Complex c2 = new Complex();
	  c2.display();
	  
	  Complex c3 = new Complex();
	  c3 = c1.getSum(c2);
	  c3.display();
	  
	  Complex c4 = new Complex();
	  c4 = c1.getDifference(c2);
	  c4.display();
	  
	  Complex c5 = new Complex();
	  c5 = c1.getProduct(c2);
	  c5.display();
	  
	}
}
