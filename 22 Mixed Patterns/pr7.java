//     1		      1
//   3 2 1		    3 2 1
// 5 4 3 2 1 		  5 4 3 2 1
//			7 6 5 4 3 2 1
//
import java.util.*;
class P7{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num = 1;
		for (int i=1; i<=row; i++){
			for (int sp=1; sp<=row-i; sp++){
				System.out.print("\t");
			}
			for (int j=1; j<=2*i-1; j++){
				System.out.print(num + "\t");
			}
		
			System.out.println();
		}
	}
}

