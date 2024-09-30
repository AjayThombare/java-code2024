// 4 		3 
// 3 3 		2 2 
// 2 2 2 	1 1 1 
// 1 1 1 1	2 2 
// 2 2 2 	3
// 3 3 
// 4
//
import java.util.*;
class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();
		int temp = row;
		int col= 0;
		for (int i=1; i<row*2; i++){
			if (i<row){
				col = i;
				for (int j=1; j<=col; j++){
					System.out.print(temp+"\t");
				}
				temp--;
			}
			else {
				col = row*2-i;
				for (int j=1; j<=col; j++){
					System.out.print(temp + "\t");
				}
				temp++;
			}
			System.out.println();
		}
	}
}







