//     1 		      1
//   B B B 		    B B B 
// 3 3 3 3 3		  3 3 3 3 3 
// 			D D D D D D D
//
import java.util.*;
class P7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row :");
		int row = sc.nextInt();
		int num = 65;
		for (int i=1; i<=row; i++){
			for (int space=1; space<=row-i; space++){
				System.out.print("\t");
			}
			for (int j=1; j<=2*i-1; j++){
				if (i%2==1){
					System.out.print(i+"\t");
				}
				else {
					System.out.print((char)num+"\t");
				}
			}
			num++;
			System.out.println();
		}
	}
}

