package revision;
public class RegionCutBySlashes {
	    public static int rows;
	    public static int cols;
	    public static int dir[][] = {{-1,0},{0,1},{1,0},{0,-1}};
	    public static void dfs(int row, int col, int matrix[][]){
	        if(row<0 || row>=rows || col<0 || col>=cols || matrix[row][col] == 1){
	            return;
	        }
	        matrix[row][col] = 1;
	        for(int i=0; i<4; i++){
	            dfs(row + dir[i][0] , col + dir[i][1], matrix);
	        }
	    }
	    public static int regionsBySlashes(String[] grid) {
	        int size = grid.length;
	        rows = size*3;
	        cols = size*3;
	        int matrix[][] = new int[rows][cols];
	        for(int i=0; i<size; i++){
	            for(int j=0; j<size; j++){
	                int row = i*3;
	                int col = j*3;
	                if(grid[i].charAt(j) == '/'){
	                   matrix[row][col+2] = 1;
	                   matrix[row+1][col+1] = 1;
	                   matrix[row+2][col] = 1;
	                }else if(grid[i].charAt(j) == '\\'){
	                   matrix[row][col] = 1;
	                   matrix[row+1][col+1] = 1;
	                   matrix[row+2][col+2] = 1;
	                }
	            }
	        }
	        int count = 0;
	        for(int i=0; i<rows; i++){
	            for(int j=0; j<cols; j++){
	                if(matrix[i][j] == 0){
	                    dfs(i,j,matrix);
	                    count++;
	                }
	            }
	        }
	        return count; 
	    }
	    public static void main(String args[]) {
	    	String[] array = new String[] { " /","/ "};
	    	System.out.println(regionsBySlashes(array));
	    }
}
