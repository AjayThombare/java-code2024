//       1 
//     1 2 
//   1 2 3 
// 1 2 3 4 
//
import java.util.*;
class P2{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			for (int space=1; space<=row-i; space++){
				System.out.print("  ");
			}
			int num = 1;
			for (int j=1; j<=i; j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}

