// 9   4   25		4  25  18  7 
// 18  7   8		8  27  50  11
// 27  50  11		36 13  14  45
// 			16 17  54  19
import java.util.*;
class P2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num = row;
		for (int i=1; i<=row; i++){
			for (int j=1; j<=row; j++){
				if (num%3==0){
					System.out.print(num*3+"\t");
				}
				else if (num%5==0){
					System.out.print(num*5+"\t");
				}
				else {
					System.out.print(num+ "\t");
				}
				num++;
			}
			System.out.println();
		}
	}
}

