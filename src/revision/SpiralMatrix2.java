package revision;
import java.util.*;
public class SpiralMatrix2 {
	public static int[][] generateMatrix(int n) {
        int[][] newMatrix = new int[n][n];
        int[][] res = new int[n][n];
        int val = 1;
        int rowBegin = 0;
        int rowEnd = n-1;
        int colBegin = 0;
        int colEnd = n-1;
        
        while(rowBegin <= rowEnd && colBegin <= colEnd && val <= n*n){
            for(int i=colBegin; i<=colEnd; i++){
                newMatrix[rowBegin][i] = val;
                val++;
            }
            rowBegin++;

            for(int i=rowBegin; i<=rowEnd; i++){
                newMatrix[i][colEnd] = val;
                val++;
            }
            colEnd--;

            for(int i=colEnd; i>=colBegin; i--){
                newMatrix[rowEnd][i] = val;
                val++;
            }
            rowEnd--;

            for(int i=rowEnd; i>=rowBegin; i--){
                newMatrix[i][colBegin] = val;
                val++;
            }
            colBegin++;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
               res[i][j] = newMatrix[i][j];
            }
        }
        return res;
    }
	public static void main(String args[]) {
		int n=3;
		int[][] result = generateMatrix(n);

        // Print the result
        System.out.println("Generated Spiral Matrix:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
		
	}
}
