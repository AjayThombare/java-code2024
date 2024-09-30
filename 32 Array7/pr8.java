// WAP to take number from a user in 2D array and print the sum of the secondary diagonal of array
//
import java.io.*;
class P8{
	public static void main(String []args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter row and column :");
		int row = Integer.parseInt(br.readLine());
		int col = Integer.parseInt(br.readLine());

		int arr[][] = new int[row][col];
		System.out.println("Enter array elements :");
		for (int i=0; i<row; i++){
			for (int j=0; j<col; j++){
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		int sum = 0;
		for (int i=0; i<row; i++){
			for (int j=0; j<col; j++){
				int p = i;
				if (i==p&&j==col-p-1){
					sum = sum+arr[i][j];
				}
			}
		}
		System.out.println("sum of second diagonal elements " + sum);
	}
}


					


