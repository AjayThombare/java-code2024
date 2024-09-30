// A B C D C B A
//   A B C B A
//     A B A
//       A
//
import java.util.*;
class P8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			int num = 65;
			for (int sp=1; sp<i; sp++){
				System.out.print("\t");
			}
			for (int j=1; j<=(row-i)*2+1; j++){
				if (j<(row-i+1)){
					System.out.print((char)(num)+"\t");
					num++;
				}
				else {
					System.out.print((char)(num)+"\t");
					num--;
				}
			}
			System.out.println();
		}
	}
}

