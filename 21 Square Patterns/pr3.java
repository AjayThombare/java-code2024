// 9   4   5			16   5   6   7
// 36  7   8 			64   9   10  11
// 81  10  11			144  13  14  15
// 				256  17  18  19

import java.util.*;
class P3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num = row;
		for (int i=1; i<=row; i++){
			for (int j=1; j<=row; j++){
				if (j==1){
					System.out.print(num*num+"\t");
				}
				else {
					System.out.print(num+"\t");
				}
				num++;
			}
			System.out.println();
		}
	}
}

