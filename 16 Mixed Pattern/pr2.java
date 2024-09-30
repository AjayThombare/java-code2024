// C3 C2 C1			D4 D3 D2 D1
// C4 C3 C2			D5 D4 D3 D2
// C5 C4 C3			D6 D5 D4 D3
//				D7 D6 D5 D4
//

import java.util.*;
class P2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter row : " );
		int row  = sc.nextInt();
		
		//System.out.print("Enter char : ");
		//char ch = sc .next().charAt(0);

		for (int i=1; i<=row; i++){
			
			int num = row+i-1;
			
			for (int j=1; j<=row; j++){
				System.out.print("C" + num-- + " " );
			}
			System.out.println();
		}
	}
}




