// 	A			A
//    a b a		      a b a
//  A B C B A		    A B C B A
//  			  a b c d c b a
//
import java.util.*;
class P9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row :");
		int row = sc.nextInt();
		
		for (int i=1; i<=row; i++){
			int num1 = 65;
			int num2 = 97;
			for (int space=1; space<=row-i; space++){
				System.out.print("\t");
			}
			if (i%2==1){
				for (int j=1; j<=2*i-1; j++){
					if (j<i){
						System.out.print((char)num1+"\t");
						num1++;
					}
					else {
						System.out.print((char)num1+"\t");
						num1--;
					}
				}
			}
			else {
				for (int j=1; j<=2*i-1; j++){
					if (j<i){
						System.out.print((char)num2+"\t");
						num2++;
					}
					else {
						System.out.print((char)num2+"\t");
						num2--;
					}	
				}
			}				
			System.out.println();
		}
	}
}

