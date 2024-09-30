// F E D 			J I H G 
// C B 				F E D 
// A 				C B 
// 				A
import java.util.*;
class P8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num = 64+(((row*row)+row)/2);

		for (int i=1; i<=row; i++){
			for (int j=1; j<=row-i+1; j++){
				System.out.print((char)(num--) + " ");
			}
			System.out.println();
		}
	}
}

