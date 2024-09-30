//  C B A	D C B A  
//  3 3 3	4 4 4 4 
//  C B A	D C B A
//  		4 4 4 4
//
import java.util.*;
class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			int num = 64+row;
			for (int j=1; j<=row; j++){
				if (i%2==1){
					System.out.print((char)+(num)+ " " );
					num--;
				}
				else {
					System.out.print(row+" ");
				}
			}
			System.out.println();
		}
	}
}

				
									
