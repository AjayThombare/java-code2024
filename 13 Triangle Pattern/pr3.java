// for 4 row 			for 5 row
// 20 18 16 14 			30 28 26 24 22 
// 12 10 8  			20 18 16 14 
// 6 4 				12 10 8 
// 2				6  4 
//				2


import java.util.*;
class P3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row :");
		int row = sc.nextInt();
		int num = row*(row+1);
		for (int i=1; i<=row; i++){
			for (int j=1; j<=row-i+1; j++){
				System.out.print(num + " ");
				num = num-2;
			}
			System.out.println();
		}
	}
}



