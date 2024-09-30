// WAP to take numbers from a user in 2D array and print the sum of each row in the array

import java.io.*;
class P3{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter row and column : ");
		int row = Integer.parseInt(br.readLine());
		int col = Integer.parseInt(br.readLine());

		int arr[][] = new int[row][col];

		System.out.println("Enter array elements :");
		for (int i=0; i<row; i++){
			for (int j=0; j<col; j++){
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		for (int i=0; i<row; i++){
			int sum = 0;
			for (int j=0; j<col; j++){
				sum = sum+arr[i][j];
			}
			System.out.println("Sum of row "+ i+1 +" is " + sum);
			System.out.println();
		}
	}
}


