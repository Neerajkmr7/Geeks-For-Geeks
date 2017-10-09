
public class RotateMatrixInPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{1,  2,  3,  4},
				{5,  6,  7,  8},
				{9,  10, 11, 12},
				{13, 14, 15, 16}
		};
		System.out.println("Original");
		printMatrix(matrix);
		rotateMatrixInplace(matrix);
		System.out.println("Rotated");
		printMatrix(matrix);
	}

	private static void rotateMatrixInplace(int[][] matrix) {
		// TODO Auto-generated method stub
		int N = matrix.length;
		int length = matrix.length-1;

		for(int i=0; i<=length/2; i++){
			for(int j=i;j<length-i;j++){
				//Coordinate 1
			       int p1 = matrix[i][j];
			        
			       //Coordinate 2
			       int p2 = matrix[j][length-i];
			        
			       //Coordinate 3
			       int p3 = matrix[length-i][length-j];
			        
			       //Coordinate 4
			       int p4 = matrix[length-j][i];
			        
			       //Swap values of 4 coordinates.
			       matrix[j][length-i] = p1;
			       matrix[length-i][length-j] = p2;
			       matrix[length-j][i] = p3;
			       matrix[i][j] = p4;
			} 
		}
		
		/*for (int x = 0; x < N / 2; x++)
	    {
	        // Consider elements in group of 4 in 
	        // current square
	        for (int y = x; y < N-x-1; y++)
	        {
	            // store current cell in temp variable
	            int temp = matrix[x][y];
	 
	            // move values from right to top
	            matrix[x][y] = matrix[y][N-1-x];
	 
	            // move values from bottom to right
	            matrix[y][N-1-x] = matrix[N-1-x][N-1-y];
	 
	            // move values from left to bottom
	            matrix[N-1-x][N-1-y] = matrix[N-1-y][x];
	 
	            // assign temp to left
	            matrix[N-1-y][x] = temp;
	        }
	    }*/

	}

	private static void printMatrix(int[][] matrix){
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " "); 
			}
			System.out.println();
		}
	}
}
