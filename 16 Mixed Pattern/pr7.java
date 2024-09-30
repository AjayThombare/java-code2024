// 2   4   6   8 		2  4  6  8  10 
// 10  12  14 			12 14 16 18
// 16  18 			20 22 24 
// 20				26 28 
// 				30

import java.util.*;
class P7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : " );
		int row = sc.nextInt();
		
		int num1 = 2;
		for (int i=1; i<=row; i++){
			for (int j=1; j<=row-i+1; j++){
				System.out.print(num1 + " ");
				num1 = num1+2;
			}
			System.out.println();
		}
	}
}

