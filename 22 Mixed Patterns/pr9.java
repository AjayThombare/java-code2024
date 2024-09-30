//     3   		      4
//   4 3 2		    5 4 3
// 5 4 3 2 1		  6 5 4 3 2 
// 			7 6 5 4 3 2 1
//
import.java.util.*;
class P9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row :");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			for (int sp=1; sp<=row-i; sp++){
				System.out.print("\t");
			}
			for (int 
