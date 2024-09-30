// 8  e  24 		15   f   35   h
// g  h  i 		i    j   k    l
// 80 k  120		143  n   195  p
// 			q    r   s    t
//
import java.util.*;
class P8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num1 = row;
		int num2 = 96+row+1;
		for (int i=1; i<=row; i++){
			for (int j=1; j<=row; j++){
				if (i%2==0 || j%2==0){
					System.out.print((char)(num2)+"\t");
				}
				else {
					System.out.print(num1*num1-1 +"\t");
				}
				num1++;
				num2++;

			}
			System.out.println();
		}
	}
}

