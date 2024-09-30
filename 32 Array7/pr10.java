// WAP to take numbers from a user in a 2D array and print the corner element in an array
//
import java.util.*;
class P10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int arr[][] = new int[row][col];
		System.out.println("Enter array elements ");
		for (int i=0; i<row; i++){
			for (int j=0; j<col; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i=0; i<row; i++){
			for (int j=0; j<col; j++){
				if (i==0&&j==0 || i==0&&j==col-1 || i==row-1&&j==0 || i==row-1&&j==col-1){
					System.out.print(arr[i][j]+"   ");
				}
			}
		}
	}
}

