// A B C 		a b c d
//   B C 		  b c d 
//     C		    c d
//     			      d
//
import java.util.*;
class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num = 65;
		for (int i=1; i<=row; i++){
			for (int sp=1; sp<i; sp++){
				System.out.print("\t");
			}
			for (int j=1; j<=row-i+1; j++){
				System.out.print((char)(num)+"\t");
				num++;
			}
			//num++;
			System.out.println();
		}
	}
}

