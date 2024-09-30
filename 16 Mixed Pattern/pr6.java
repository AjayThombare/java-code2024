// c 				d 
// 3 2 				4 3 
// c b a 			d c b 
// 				4 3 2 1 
//
import java.util.*;;
class P6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			int num1 = row;
			int num2 = 96+row;
			for (int j=1; j<=i; j++){
				if (i%2==1){
					System.out.print((char)(num2--)+ " ");
				}
				else {
					System.out.print(num1-- + " ");
				}
			}
			System.out.println();
		}
	}
}


