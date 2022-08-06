import java.util.*;
class Matrix{
	public int row;
	public int coloumn;
	int [][]array;
	
	Matrix(int r, int c)
	{
		this.row = r;
		this.coloumn = c;
		array = new int [row][coloumn];	
	}
	
	public int getRows()
	{
		return row;
	}
	
	public int getColoumn()
	{
		return coloumn;
	}
	
	public int getElement(int r, int c)
	{
		return array[r][c];
	}
	
	public void setElement(int r, int c, int element)
	{
		array[r][c] = element;
	}
	
	//function to add matrix
	public static Matrix add(Matrix x, Matrix y)
	{
		if((x.row == y.row) && (x.coloumn == y.coloumn))
		{
			Matrix m = new Matrix(x.row,x.coloumn);
		     for(int i=0; i<m.row; i++)
				  {
				    for(int j=0; j<m.coloumn; j++)
				      {
				    	m.setElement(i,j,(x.getElement(i,j)+y.getElement(i,j)));	  
				       }
				  }
		     return m;
		}
		else
		{
			System.out.println("Matrices can not be added");
			return new Matrix(0,0);
		}
	}
	
	public static Matrix product(Matrix x, Matrix y)
	{
		Matrix m = new Matrix(x.row, y.coloumn);
		for(int j=0; j<x.row; j++)
		{
			for(int i=0; i<y.coloumn; i++)
			{
				int sum=0;
				for(int k=0; k<x.coloumn;k++)
				{
					sum = sum + (x.getElement(j,k)*y.getElement(k, i));
				}
				m.setElement(j, i, sum);
			}
		}
		return m;
	}
	
	public void printMatrix()
	{
		System.out.println("Matrix is: ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<coloumn; j++)
			{
				System.out.print(array[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
public class classandboject1 {
   public static void main(String[] args)
   {
	   Matrix m = new Matrix(3,3);
	   Matrix n = new Matrix(3,3);
	   int k=1;
	   for(int i=0; i<3; i++)
	   {
		   for(int j=0; j<3; j++)
		   {
			   m.setElement( i, j, k);
			   k++;
			   n.setElement (i,j,k);
			   k++;
		   }
	   }
	   
	   m.printMatrix();
	   n.printMatrix();
	   
	   Matrix o = Matrix.add(m, n);
	   o.printMatrix();
	   
	   Matrix p =  Matrix.product(m, n);
	   p.printMatrix();
    }	   
}
