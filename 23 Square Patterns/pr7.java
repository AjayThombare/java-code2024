// 8   16   24	 		15   25   35   49
// 36  49   64			64   81   100  121 
// 10  100  120			143  169  195  225
// 				256  289  324  361
//
import java.util.*;
class P7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num = row;
		for (int i=1; i<=row; i++){
			for (int j=1; j<=row; j++){
				if (i%2==0 || j%2==0){
					System.out.print(num*num+"\t");
				}
				else {
					System.out.print(num*num-1 +"\t");
				}
				num++;
			}
			System.out.println();
		}
	}
}

