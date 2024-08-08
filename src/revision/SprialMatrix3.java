package revision;
import java.util.*;
public class SprialMatrix3 {
	public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int steps = 0;
        int totalCells = rows*cols;
        List<int[]> result = new ArrayList<>();
        int r = rStart, c = cStart;
        int d = 0;

        result.add(new int[]{r,c});
        while(result.size() < totalCells){
           if(d == 0 || d == 2){
              steps++;
           }

           for(int count=0; count<steps; count++){
            r += directions[d][0];
            c += directions[d][1];

            if(r >= 0 && r < rows && c >= 0 && c < cols){
                result.add(new int[]{r,c});
            }
           }

           d = (d+1)%4;
        }
      return result.toArray(new int[result.size()][]);
    }
	public static void main(String args[]) {
		int rows = 3;
        int cols = 3;
        int rStart = 0;
        int cStart = 0;
        
        // Call the method
        int[][] result = spiralMatrixIII(rows, cols, rStart, cStart);
        
        // Print the result
        System.out.println("Spiral Order of Matrix:");
        for (int[] pos : result) {
            System.out.println(Arrays.toString(pos));
        }
	}
}
