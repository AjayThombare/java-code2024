//     1 			      1
//   1 2 1			    1 2 1
// 1 2 3 2 1 			  1 2 3 2 1
// 				1 2 3 4 3 2 1 
//
import java.util.*;
class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row :");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			int num = 1;
			for (int space=1; space<=row-i; space++){
				System.out.print("\t");
			}
			for (int j=1; j<=2*i-1; j++){
				if (j<i){
					System.out.print(num+"\t");
					num++;
				}
				else {
					System.out.print(num+"\t");
					num--;
				}
			}
			System.out.println();
		}
	}
}

