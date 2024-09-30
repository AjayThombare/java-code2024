// 1 2 3 4 3 2 1 
//   2 3 4 3 2 
//     3 4 3
//       4
//
import java.util.*;
class P9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			int num = i;
			for (int sp=1; sp<i; sp++){
				System.out.print("\t");
			}
			for (int j=1; j<=(row-i)*2+1; j++){
				if (j<(row-i+1)){
					System.out.print(num+"\t");
					num++;
				}
				else {
					System.out.print(num+"\t");
					num--;
				}
			}
			System.out.println();
		}
	}
}

