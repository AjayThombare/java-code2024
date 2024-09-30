//  D C B A 			E D C B A 
//    D C B 			  E D C B 
//      D C 			    E D C
//        D 			      E D
//        				E
//
import java.util.*;
class P10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			int ch = 64+row;
			for (int space=1; space<i; space++){
				System.out.print("  ");
			}
			for (int j=1; j<=row-i+1; j++){
				System.out.print((char)ch-- + " ");
			}
			System.out.println();
		}
	}
}

