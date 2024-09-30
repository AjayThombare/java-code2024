// D 		C 
// C C		B B 
// B B B 	A A A
// A A A A	B B
// B B B	C
// C C
// D
//
import java.util.*;
class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();
		int col = 0;
		int num = 64;
		int temp = row;
		for (int i=1; i<row*2; i++){
			if (i<row){
				col = i;
				for (int j=1; j<=col; j++){
					System.out.print((char)(num+temp)+"\t");
				}
				temp--;
			}
			else {
				col = row*2-i;
				for (int j=1; j<=col; j++){
					System.out.print((char)(num+temp)+"\t");
				}
				temp++;
			}
			System.out.println();
		}
	}
}

