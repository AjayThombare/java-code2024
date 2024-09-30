//        3		    2
//      2 3		  1 2
//    1 2 3 	    	0 1 2
//  0 1 2 3		  1 2
//    1 2 3		    2
//      2 3
//        3
//
import java.util.*;
class P9{
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
			if (i<=row){
				col = i;
				int temp = row-i;
				for (int j=1; j<=col; j++){
					System.out.print(temp + "\t");
					temp++;
				}
			}
			else {
				int temp = i-row;
				col = row*2-i;
				for (int j=1; j<=col; j++){
					System.out.print(temp +"\t");
					temp++;
				}
			}
			System.out.println();
		}
	}
}


