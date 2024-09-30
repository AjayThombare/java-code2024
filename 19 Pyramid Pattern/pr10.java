//     C 					D
//   B C B				      C	D C
// A B C B C A				    B C	D C B 
// 					  A B C	D C B A
//
import java.util.*;
class P10{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			int num = 64+row-i+1;
			for (int space=1; space<=row-i; space++){
				System.out.print("\t");
			}
			for (int j=1; j<=2*i-1; j++){
				if(j<i){
					System.out.print((char)num+"\t");
					num++;
				}
				else {
					System.out.print((char)num+"\t");
					num--;
				}
			}
			System.out.println();
		}
	}
}


