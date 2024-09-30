//  C B A 		D C B A 
//  1 2 3 		1 2 3 4 
//  C B A 		D C B A 
//  			1 2 3 4 
//
import java.util.*;
class P3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			int num1 = 1;
			int num2 = 64+row;
			for (int j=1; j<=row; j++){
				if (i%2==1){
					System.out.print((char)(num2)+ " ");
					num2--;
				}
				else {
					System.out.print(num1++ + " ");
				}
			}
			System.out.println();
		}
	}
}

