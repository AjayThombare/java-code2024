// WAP  to take number from a user in a 2D array and print the product of sum of the primary and secondary diagonal of an array

import java.io.*;
class P9{
	public static void main(String []args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter row and column");
		int row = Integer.parseInt(br.readLine());
		int col = Integer.parseInt(br.readLine());

		int arr[][] = new int[row][col];
		System.out.println("Enter array elements : ");
		for (int i=0; i<row; i++){
			for (int j=0; j<col; j++){
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		int sum1 = 0;
		int sum2 = 0;
		for (int i=0; i<row; i++){
			for (int j=0; j<col; j++){
				if (i==j){
					sum1 = sum1+arr[i][j];
				}
			}					
			for (int j=0; j<col; j++){
                                int p = i;
                                if (i==p&&j==col-p-1){
                                        sum2 = sum2+arr[i][j];
                                }
			}
		}
		//System.out.println("sum is "+ sum1);
		//System.out.println("sum2 is "+sum2);
		System.out.println("product of sum of primary and secondary diagonals is " + sum1*sum2);
	}
}
    

