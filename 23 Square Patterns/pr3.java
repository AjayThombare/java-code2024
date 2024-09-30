// c  4  e 		d  5   f   7 
// 6  g  8 		8  i   10  k
// i  10 k 		l  13  n  15
//			16 q   18  s
//
import java.util.*;
class P3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num1 = row;
		int num2 = 96+row;
		for (int i=1; i<=row; i++){
			for (int j=1; j<=row; j++){
				if (num1%2==1){
					System.out.print((char)(num2)+"\t");
				}
				else {
					System.out.print(num1+"\t");
				}

				num1++;
				num2++;
			}
			System.out.println();
		}
	}
}

