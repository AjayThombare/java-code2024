// 4 c 2 a 		5 d 3 b 1 
// 3 b 1 		4 c 2 a 
// 2 a 			3 b 1 
// 1  			2 a  
//			1
//
import java.util.*;
class P7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num1 = row; 
		int num2 = 96+row;

		for (int i=1; i<=row; i++){
			//int num1 = row;
			//int num2 = 96+row;
			for (int j=1; j<=row-i+1; j++){
				if (j%2==1){
					System.out.print(num1 + " " );
					num1 = num1-2;
				}
				else {
					System.out.print((char)(num2)+ " ");
					num2= num2-2;
				}
		
			
			}
			System.out.println();
		}
	}
}


