//	    3			      4
//	  2 2 2 		    3 3 3 
//	1 1 1 1 1		  2 2 2 2 2
//	 			1 1 1 1 1 1 1
//
import java.util.*;
class P3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row :");
		int row = sc.nextInt();
		int num = row;

		for (int i=1; i<=row; i++){
			for (int space=1; space<=row-i; space++){
				System.out.print("\t");
			}
			for (int j=1; j<=2*i-1; j++){
				System.out.print(num+"\t");
			}
			num--;
			System.out.println();
		}
	}
}

