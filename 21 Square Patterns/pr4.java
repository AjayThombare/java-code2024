// C 4  5 		D  5   6   7 
// F 7  8 		H  9   10  11
// I 10 11		L  13  14  15 
// 			P  17  18  19
//
import java.util.*;
class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row :");
		int row = sc.nextInt();
		
		int num1 = 64+row;
		int num2 = row;
		for (int i=1; i<=row; i++){
			for (int j=1; j<=row; j++){
				if (j==1){
					System.out.print((char)+(num1)+"\t");
				}
				else {
					System.out.print(num2+"\t");
				}
				num1++;
				num2++;
			}
			System.out.println();
		}
	}
}

