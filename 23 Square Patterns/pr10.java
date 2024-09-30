// $  16  21 		$   30   42   52 
// 6  $   12 		12  $    30   36
// 3  4   $		8   14   $    20
// 			4   6    6    $
//
import java.util.*;
class P10{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++){
			int num = row*(row-i+1);
			int temp = num;
			for (int j=1; j<=row; j++){
				if (i==j){
					System.out.print("$"+"\t");
				}
				else {
					System.out.print(num+"\t");
				}
				temp = temp-2;
				num = num+temp;
			}
			System.out.println();
		}
	}
}


