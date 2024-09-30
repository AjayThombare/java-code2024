// 3			4
// 2 4 			3 6 
// 1 2 3 		2 4 6 
// 			1 2 3 4
//
import java.util.*;
class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){

			int num = row-i+1;
				;
			for (int j=1; j<=i; j++){
				System.out.print(num*j + " ");
			}
			
			System.out.println();
		}
	}
}


