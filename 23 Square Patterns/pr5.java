//3 $ 4		4 $ 5 $ 
//4 4 4 	6 6 6 6 
//4 $ 5 	6 $ 7 $ 
//		8 8 8 8 
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
				if (i%2==1){
					if (j%2==1){
						System.out.print(num+"\t");
					}
					else {
						System.out.print("$"+"\t");
						num++;
					}
					
				}
				else {
					System.out.print(num+"\t");
				}
			}
			System.out.println();
		}
	}
}

