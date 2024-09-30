//     	  1			     1
//     3  5		         3   5 
//  7  9  11		     7   9   11
//  			 13  17  19  23
//
import java.util.*;
class P1{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num = 1;
		for (int i=0; i<=row; i++){
			for (int sp=1; sp<=row-i; sp++){
				System.out.print("\t");
			}
			for (int j=1; j<=i; j++){
				System.out.print(num+"\t");
				num = num+2;
			}
			//num = num+2;
			System.out.println();
		}
	}
}

