//     1				 1
//   2 3 4 		              2  3  4 
// 5 6 7 8 9			   5  6  7  8  9 
// 			       10  11 12 13 14 15 16
//
import java.util.*;
class P2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num = 1;

		for (int i=1; i<=row; i++){
			for (int space=1; space<=row-i; space++){
				System.out.print("\t");
			}
			for (int j=1; j<=2*i-1; j++){
				System.out.print(num++ + "\t");
			}
			System.out.println();
		}
	}
}


