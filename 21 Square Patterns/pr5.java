// 3   16   5 		16   5   36   7 
// 36  7    64		64   9   100  11
// 9   100  11		144  13  196  15
// 			256  17  324  19
//
import java.util.*;
class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num = row;
		for (int i=1; i<=row; i++){
			for (int j=1; j<=row; j++){
				if (num%2==0){
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

