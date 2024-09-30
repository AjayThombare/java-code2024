// 5 4 3 2 1 		4 3 2 1 
// D C B A 		C B A 
// 3 2 1 		2 1 
// B A 			A 
// 1

import java.util.*;
class P8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num1 = row;
		//int num2 = 64+(row-i);
		for (int i=1; i<=row; i++){
//			int num1 = row;
			int num2 = 64+(row-i);
			for (int j=1; j<=row-i+1; j++){
				if (i%2==1){
					System.out.print(num1 + " ");
					num1--;
				}
				else {
					System.out.print((char)(num2));
					num2--;

				}

			}
			System.out.println();
		}
	}
}


