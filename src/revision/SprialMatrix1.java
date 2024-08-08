package revision;
import java.util.*;
public class SprialMatrix1 {
	public static List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int rowBegin = 0;
        int rowEnd = row-1;
        int colBegin = 0;
        int colEnd = col-1;
        ArrayList<Integer> result = new ArrayList<>();

        while(rowBegin <= rowEnd && colBegin <= colEnd)
        {
            //Traverse Right
            for(int i = colBegin; i <= colEnd; i++){
                result.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            
            //Traverse Down
            for(int i = rowBegin; i <= rowEnd; i++){
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            //Traverse Left
            if(rowBegin <= rowEnd)
            {
            for(int i = colEnd; i>=colBegin; i--){
                result.add(matrix[rowEnd][i]);
            }
            rowEnd--;
            }
            
            //Traverse Up
            if(colBegin <= colEnd)
            {
                for(int i = rowEnd; i >= rowBegin; i--){
                    result.add(matrix[i][colBegin]);
                }
                colBegin++;
            }
            
        }
        return result;
    }
	public static void main(String args[]) {
		int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        // Call the method
	        List<Integer> result = spiralOrder(matrix);

	        // Print the result
	        System.out.println("Spiral Order of Matrix:");
	        System.out.println(result);
	}
}
