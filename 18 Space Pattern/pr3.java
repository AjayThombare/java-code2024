 //         3 				      4
 //       3 2 				    4 3
 //     3 2 1 				  4 3 2 	
 //     				4 3 2 1
 //
import java.util.*;
class P3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			for (int space=1; space<=row-i; space++){
				System.out.print("  ");
			}
			int num = row;
			for (int j=1; j<=i; j++){
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
	}
}

