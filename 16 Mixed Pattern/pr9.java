// 1 2 3 4 			1 2 3 4 5 
// C B A 			D C B A 
// 1 2 				1 2 3 
// A 				B A 
// 				1
import java.util.*;
class P9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			int num1 = 1;
			int num2 = 63+row;
			for (int j=1; j<=row-i+1; j++){
				if (i%2==1){		
					System.out.print(num1++ +" ");
				}
				else {
					System.out.print((char)(num2--) + " ");
				}
				num2--;
			}
			System.out.println();
		}
	}
}

