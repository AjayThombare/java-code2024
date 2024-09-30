// A  4  A		4  A  6   A
// 6  B  8		8  B  10  B
// C  10 C		12 C  14  C
// 			16 D  18  D 
//
import java.util.*;
class P7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num1 = row;
		for (int i=1; i<=row; i++){
			int num2 = 64+i;
			for (int j=1; j<=row; j++){
				if (num1%2==1){
					System.out.print((char)(num2)+"\t");
				}
				else {
					System.out.print(num1+"\t");
				}
				num1++;
			}
			System.out.println();
		}
	}
}


