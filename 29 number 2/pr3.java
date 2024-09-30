// 1 		1 
// 2 1 		2 1 
// 3 2 1 	3 2 1 
// 2 1		4 3 2 1 
// 1		3 2 1 
// 		2 1
// 		1
//
import java.util.*;
class P3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row ; ");
		int row = sc.nextInt();
		int col = 0;
		for (int i=1; i<row*2; i++){
			if (i<=row){
				col = i;
			}
			else {
				col = row*2-i;
			}
			for (int j=col; j>=1; j--){
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}

