// 1 			1 
// 2 4 			2 4 
// 3 6 9 		3 6 9 
// 			4 8 12 16 
//

import java.util.*;
class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			for (int j=1; j<=i; j++){
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
	}
}

