// 1 a 2 			1 a 2 b  
// 1 a 				1 a 2 
// 1 				1 a 
//				1
//

import java.util.*;
class P6{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			
			int num1 = 1;
			int num2 = 97;

			for (int j=1; j<=row-i+1; j++){
				if (j%2==1){
					System.out.print(num1 + " ");
					num1++;
				}
				else {
					System.out.print((char)(num2)+" ");
					num2++;
				}
			}
			System.out.println();
		}
	}
}

				
