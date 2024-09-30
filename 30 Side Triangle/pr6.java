//       1	 	1
//     1 2 	      1	2
//   1 2 3	    1 2	3
// 1 2 3 4	      1	2
//   1 2 3		1
//     1 2 
//       1
//
import java.util.*;
class P6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();
		int col = 0;
		for (int i=1; i<row*2; i++){
			if (i<row){
				col = row-i;
			}
			else {
				col = i-row;
			}
			for (int sp=1; sp<=col; sp++){
				System.out.print("\t");
			}
			if (i<row){
				col = i;
			}
			else {
				col = row*2-i;
			}
			for (int j=1; j<=col; j++){
				System.out.print(j +"\t");
			}
			System.out.println();
		}
	}
}


