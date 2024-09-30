//     1		      1
//   1 2 3		    1 2 3
// 1 2 3 4 5 		  1 2 3 4 5 
//			1 2 3 4 5 6 7
//
import java.util.*;
class P6{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			int num = 1;
			for (int sp=1; sp<=row-i; sp++){
				System.out.print("\t");
			}
			for (int j=1; j<=2*i-1; j++){
				System.out.print(num++ +"\t");
			}
			System.out.println();
		}
	}
}

