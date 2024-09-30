//        3			   4
//      3 6		       4   8
//    3 6 9		   4   8   12
//    		       4   8   12  16
//
import java.util.*;
class P12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		for (int i=1; i<=row; i++){
			int num = row;
			for (int space=1; space<=row-i; space++){
				System.out.print("\t");
			}
			for (int j=1; j<=i; j++){
				System.out.print(num*j+"\t");
			}
			System.out.println();
		}
	}
}


