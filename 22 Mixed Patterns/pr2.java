// 1 2 3 	1 2 3 4
//   3 4 	  4 5 6 
//     4	    6 7 
//     		      7
//
import java.util.*;
class P2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num = 1;
		for (int i=1; i<=row; i++){
			for (int sp=1; sp<i; sp++){
				System.out.print("\t");
			}
			for (int j=1; j<=row-i+1; j++){
				System.out.print(num+"\t");
				num++;
			}
			num--;	
			System.out.println();
		}
	}
}

