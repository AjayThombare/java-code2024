// & & & 		& & & &
// & $ & 		& $ & $
// & & &		& & & &
// 			& $ & $
//
import java.util.*;
class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			for (int j=1; j<=row; j++){
				if (i%2==0 && j%2==0){
					System.out.print("$"+"\t");
				}
				else {
					System.out.print("&"+"\t");
				}
			}
			System.out.println();
		}
	}
}

