//       1
//     2 2 		    1
//   3 3 3		  2 2 
// 4 4 4 4 		3 3 3  
//   3 3 3 		  2 2 
//     2 2  		    1
//       1
//
import java.util.*;
class P8{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : " );
		int row = sc.nextInt();
		int col = 0;
		for (int i=1; i<row*2; i++){
			if (i<=row){
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
				for (int j=1; j<=col; j++){
					System.out.print(col + "\t");
				}
			}
			else {
				col = row*2-i;
				for (int j=1; j<=col; j++){
					System.out.print(col +"\t");
				}
			}
			System.out.println();
		}
	}
}

