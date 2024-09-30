// # C #		# D # C
// C # B 		D # C #
// # C 3		# D # C
// 			D # C #
//
import java.util.*;
class P8{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num1 = row;
		for (int i=1; i<=row; i++){
			int num2 = 64+row;
			for (int j=1; j<=row; j++){
				if (num1%2==1){
					System.out.print("#"+"\t");
				}
				else {
					System.out.print((char)(num2)+"\t");
					num2--;
				}
				num1++;

			}
			System.out.println();
		}
	}
}

