// 		C		D 
// 	      B C 	      C D
// 	    A B C	    B C D
// 	                  A B C D 

import java.util.*;
class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			for (int space=1; space<=row-i; space++){
				System.out.print("  ");
			}
			int num = 65+row-i;
			for (int j=1; j<=i; j++){
				System.out.print((char)(num)+" ");
				num++;
			
			}
			System.out.println();
		}
	}
}

