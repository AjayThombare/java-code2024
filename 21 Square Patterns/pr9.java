// 2 6 6 		2  6  6  12
// 3 4 9 		3  4  9  8
// 2 6 6 		2  6  6  12
// 			3  4  9  8
//
import java.util.*;
class P9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			for (int j=1; j<=row; j++){
				if (i%2==1){
					if (j%2==1){
						System.out.print(j*2+"\t");
					}
					else {
						System.out.print(j*3+"\t");
					}
				}
				else {
					if (j%2==1){
						System.out.print(j*3+"\t");
					}
					else {
						System.out.print(j*2+"\t");
					}
				}
			}
			System.out.println();
		}
	}
}

