// c d E		d e f G
// f G H		h i J K
// I J K 		l M N O 
// 			P Q R S

import java.util.*;
class P2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num1 = 64+row;
		int num2 = 96+row;
		for (int i=row; i>=1; i--){
			for (int j=1; j<=row; j++){
				if (j>=i){
					System.out.print((char)(num1)+"\t");
				}
				else {
					System.out.print((char)(num2)+"\t");
				}
				num1++;
				num2++;
			}
			System.out.println();
		}
	}
}

