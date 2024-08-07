package revision;
public class MagicSquares {
	public static int findRowSum(int grid[][], int r, int c){
        boolean visited[] = new boolean[10];
        int sum = 0;
        for(int i=0; i<3; i++){
            int rowSum = 0;
            for(int j=0; j<3; j++){
                int val = grid[r+i][c+j];
                if(val == 0 || val >= 10 || visited[val]){
                    return -1;
                }
                visited[val] = true;
                rowSum += val;
            }
            if(i==0){
                sum = rowSum;
            }
            else{
                if(sum != rowSum){
                    return -1;
                }
            }
        }
        return sum;
    }
    public static int findColSum(int[][] grid, int r, int c){
        int sum = 0;
        for(int j=0; j<3; j++){
            int colSum = 0;
            for(int i=0; i<3; i++){
                int val = grid[r+i][c+j];
                colSum += val;
            }

            if(j==0){
                sum = colSum;
            }
            else{
                if(sum != colSum){
                    return -1;
                }
            }
        }
        return sum;
    }
    public static int findDiagSum(int[][] grid, int r, int c){
        int d1 = grid[r][c] + grid[r+1][c+1] + grid[r+2][c+2];
        int d2 = grid[r][c+2] + grid[r+1][c+1] + grid[r+2][c];
        if(d1 == d2){
            return d1;
        }
        else{
            return -1;
        }
    }
    public static boolean isMagicSquare(int grid[][], int r, int c){
        int rowSum = findRowSum(grid, r, c);
        if(rowSum == -1){
            return false;
        }
        int colSum = findColSum(grid, r, c);
        if(colSum == -1){
            return false;
        }
        int diagSum = findDiagSum(grid, r, c);
        if(diagSum == -1){
            return false;
        }

        if(rowSum == colSum && rowSum == diagSum){
            return true;
        }
        return false;
    }
    public static int numMagicSquaresInside(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for(int i=0; i<rows-2; i++){
            for(int j=0; j<cols-2; j++){
                if(isMagicSquare(grid,i,j)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]) {
    	int[][] grid = {{4,3,8,4},{9,5,1,9},{2,7,6,2}};
    	numMagicSquaresInside(grid);
    	for(int i=0; i<3; i++) {
    		for(int j=0; j<3; j++) {
    			System.out.print(grid[i][j] + " ");
    		}
    		System.out.println();
    	}
    }
}
