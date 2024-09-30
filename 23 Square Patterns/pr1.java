 // C d e 		D e f g 
 // F g h 		H i j k 
 // I j k 		L m n o 
 // 			P q r s
 
import java.util.*;
class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num1 = 64+row;
		int num2 = 96+row;
		for (int i=1; i<=row; i++){
			for (int j=1; j<=row; j++){
				if (j==1){
					System.out.print((char)(num1)+"\t");
				}
				else {
					System.out.print((char)(num2)+"\t");
				}
				num1++;
				num2++;
			}
			System.out.println();
		}

	}
}

