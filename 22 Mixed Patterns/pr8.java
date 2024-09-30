//     3		      4
//   2 3 4		    3 4 5 
// 1 2 3 4 5		  2 3 4 5 6
// 			1 2 3 4 5 6 7
//
import java.util.*;
class P8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
	//	int num = row;
		for (int i=1; i<=row; i++){
			int num = row-i+1;
			for (int sp=1; sp<=row-i; sp++){
				System.out.print("\t");
			}
			for (int j=1; j<=i*2-1; j++){
				System.out.print(num +"\t");
				num++;
			}
			System.out.println();
		
		}
	}
}

