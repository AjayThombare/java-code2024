// 9   16   25  		9   16   25   36 
// 6   7    8	 		7   8    9    10
// 81  100  121			121 144  169  225
// 				16  17   18   19
//
import java.util.*;
class P5{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		int num = row;
		for (int i=1; i<=row; i++){
			for (int j=1; j<=row; j++){
				if (i%2==1){
					System.out.print(num*num+"\t");
				}
				else {
					System.out.print(num+"\t");
				}
				num++;
			}
			System.out.println();
		}
	}
}
