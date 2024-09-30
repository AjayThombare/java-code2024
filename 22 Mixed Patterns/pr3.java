//           1				    1
//       4   7			        5   9
//   10  13  16			    13  17  21
//   		        	25  29  33  37
//
import java.util.*;
class P3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num = 1;
		for (int i=1; i<=row; i++){
			for (int sp=1; sp<=row-i; sp++){
				System.out.print("\t");
			}
			for (int j=1; j<=i; j++){
				System.out.print(num+"\t");
				num = num+row;
			}
			//num = num+row;
			System.out.println();
		}
	}
}

