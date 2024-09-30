// 	3 B 1 		4 C 2 A 
// 	C B A 		D C B A
// 	3 B 1 		4 C 2 A
// 			D C B A
//
import java.util.*;
class P10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			int num1 = row;
			int num2 = 64+row;
			for (int j=1; j<=row; j++){
				if(i%2==0 || j%2==0){
					System.out.print((char)(num2)+"\t");
				}
				else {
					System.out.print(num1+"\t");
				}
				num1--;
				num2--;
			}
			System.out.println();
		}
	}
}

