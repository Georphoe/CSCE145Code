/*
 * Written by Georphoe Lin
 */
import java.util.Random;
public class MatrixFlippedHorizontally {

	public static final int SIZE = 10; // width and length of the matrix
	public static final int RANDOM_RANGE = 10; // range of random number, 0~9
	public static void main(String[] args) {
		Random r = new Random();
	
		int[][] matrix = new int [SIZE][SIZE];
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
			matrix[i][j] = r.nextInt(RANDOM_RANGE);
			}
		}
		System.out.println("Created Matrix");
		for(int i = 0; i<matrix.length;i++) // print out
		{
			for(int j = 0; j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < matrix.length;i++)// swap
		{
			for(int j = 0; j<matrix[i].length/2;j++) // only need to change half of it!!
			{
				int k = 9-j;
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][k];
				matrix[i][k]=temp;
				
			}
		}
		System.out.println("Matrix flipped horizontally");
		for(int i = 0; i<matrix.length;i++) // print out
		{
			for(int j = 0; j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
