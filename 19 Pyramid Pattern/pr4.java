 //     A		      A
 //   B B B		    B B B
 // C C C C C 		  C C C C C
 // 			D D D D D D D
 //
 import java.util.*;
 class P4{
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);

		 System.out.print("Enter row : ");
		 int row = sc.nextInt();
		 int ch = 65;
		 for (int i=1; i<=row; i++){
			 for (int space=1; space<=row-i; space++){
				 System.out.print("\t");
			 }
			 for (int j=1; j<=2*i-1; j++){
				 System.out.print((char)ch +"\t");
			 }
			 ch++;
			 System.out.println();
		 }
	 }
 }

