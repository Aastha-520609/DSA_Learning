package striver;

public class SetMatrixZeroBettterApproach {
	private static int matrix[][];
	private static int m;
	private static int n;
	
	public static void setZero(int[][] inputMatrix) {
		matrix = inputMatrix;
		int n = matrix.length;
		int m = matrix[0].length;
		
		int[] row = new int[n];
		int[] col = new int[m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(matrix[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(row[i] == 1 || col[j] == 1) {
					matrix[i][j] = 0;
				}
			}
		}
		
		
		
	}
	public static void main(String args[]) {
		int[][] matrix = {
				{0,1,2,0},
				{3,4,5,2},
				{1,3,1,5}
		};
		setZero(matrix);
		System.out.println("The matrix is:");
		for(int[] row: matrix) {
			for(int num: row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}
