// A B C		A B C D 
// a b 			a b c 
// A 			A B 
//			a
//

import java.util.*;
class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			
			int num1 = 65;
			int num2 = 97;

			for (int j=1; j<=row-i+1; j++){
				if (i%2==1){
					System.out.print((char)(num1)+ "  ");
					num1++;
				}
				else {
					System.out.print((char)(num2)+ "  ");
					num2++;
				}
			}
			System.out.println();
		}
	}
}

