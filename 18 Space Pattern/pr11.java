//  65  B  67  D 		A  66  C
//      B  67  D		   66  C
//         67  D		       C
//             D
//
import java.util.*;
class P11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			int num = 65+i-1;
			for (int space=1; space<i; space++){
				System.out.print("\t");
			}
			for (int j=1; j<=row-i+1; j++){
				if (num%2==1){
					System.out.print(num +"\t");
					num++;
				}
				else {
					System.out.print((char)(num)+"\t");
					num++;
				}
			}
			System.out.println();
		}
	}
}

