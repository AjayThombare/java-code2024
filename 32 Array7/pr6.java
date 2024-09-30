// WAP to take numbers from a user in 2D array and print the element which are divisible by 3 in an array

import java.io.*;
class P6{
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
                        for (int j=0; j<col; j++){
                                if(arr[i][j]%3==0){
					System.out.print(arr[i][j]+"  ");
				}
			}

                }
        }
}
