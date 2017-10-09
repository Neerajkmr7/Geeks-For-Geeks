
public class RotateMatrix {

	private void rotateClockWise(int[][] matrix) {
		// TODO Auto-generated method stub
		int row = matrix[0].length;
		int col = matrix.length;
		int [] [] rotatedMatrix = new int[row][col];
		for(int i=0; i< matrix.length; i++){
			for(int j=0;j<matrix[0].length;j++){
				rotatedMatrix[j][col-1-i] = matrix[i][j];
			}
		}
		System.out.println("Rotated");
		printMatrix(rotatedMatrix);
	}
	
	private void rotateAntiClockWise(int[][] matrix) {
		// TODO Auto-generated method stub
		int row = matrix[0].length;
		int col = matrix.length;
		int [] [] rotatedMatrix = new int[row][col];
		for(int i=0; i< matrix.length; i++){
			for(int j=0;j<matrix[0].length;j++){
				rotatedMatrix[row-j-1][i] = matrix[i][j];
			}
		}
		System.out.println("Anti Rotated");
		printMatrix(rotatedMatrix);
	}

	private static void printMatrix(int[][] matrix){
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "   "); 
			}
			System.out.println();
		}
	}
	public static void main(String args[] ){
		int [][] matrix = { {1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
				{17, 18, 19, 20}};

		RotateMatrix rotateMatrix = new RotateMatrix();
		System.out.println("Original");
		printMatrix(matrix);
		rotateMatrix.rotateClockWise(matrix);
		rotateMatrix.rotateAntiClockWise(matrix);

	}

}
