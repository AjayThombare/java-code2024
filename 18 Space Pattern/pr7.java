// 3 3 3 		4 4 4 4 
//   2 2 		  3 3 3 
//     1 		    2 2 
//     			      1
//
import java.util.*;
class P7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row:");
		int row = sc.nextInt();
		int num = row;
		for (int i=1; i<=row; i++){
			for (int space=1; space<i; space++){
				System.out.print("  ");
			}
			for (int j=1; j<=row-i+1; j++){
				System.out.print(num+" ");
			}
			num--; 
			System.out.println();
		}
	}
}

