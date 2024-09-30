 //				      1
 //     1			    1 1 1 
 //   1 1 1 			  1 1 1 1 1 
 // 1 1 1 1 1			1 1 1 1 1 1 1 
 //
 import java.util.*;
 class P1{
	 public static void main(String[] args){
		 Scanner sc = new Scanner (System.in);

		 System.out.print("Enter row : ");
		 int row = sc.nextInt();
		 
		 int num = 1;

		 for (int i=1; i<=row; i++){
			 for (int space=1; space<=row-i; space++){
				 System.out.print("\t");
			 }
			 for (int j=1; j<=i*2-1; j++){
				 System.out.print(num+"\t");
			 }
			 System.out.println();
		 }
	 }
 }

