// 1 1 1 1 1 1 1
//   1 1 1 1 1
//     1 1 1
//       1 
//
import java.util.*;
class P2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			for (int sp=1; sp<i; sp++){
				System.out.print("\t");
			}
			for (int j=1; j<=(row-i)*2+1; j++){
				System.out.print("1"+"\t");
			}
			System.out.println();
		}
	}
}

