package striver;

public class SetMatrixZero {
	private static int[][] matrix;
	private static int n;
	private static int m;
	
	public static void setZeros(int[][] inputMatrix) {
		matrix = inputMatrix;
		n = matrix.length;
		m = matrix[0].length;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(matrix[i][j] == 0) {
					markRow(i);
					markColumn(j);
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(matrix[i][j] == -1) {
					matrix[i][j] = 0;
				}
			}
		}
	}
	
	public static void markRow(int i) {
		
		for(int j=0; j<m; j++) {
			if(matrix[i][j] != 0) {
				matrix[i][j] = -1;
			}
		}
	}
	
	public static void markColumn(int j) {
		for(int i=0; i<n; i++) {
			if(matrix[i][j] != 0) {
				matrix[i][j] = -1;
			}
		}
		
	}
	
	public static void main(String args[]) {
		 int[][] matrix = {
		            {0,1,2,0},
		            {3,4,5,2},
		            {1,3,1,5}
		        };
		 setZeros(matrix);
		 System.out.println("The matrix is:");
		 for(int[] row: matrix) {
			 for(int num: row) {
				 System.out.print(num + " ");
			 }
			 System.out.println();
		 }
		
	}

}
