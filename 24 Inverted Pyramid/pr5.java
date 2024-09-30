// 1 2 3 4 5 6 7
//   1 2 3 4 5
//     1 2 3
//       1
//
import java.io.*;
class P5{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row : ");
		int row = Integer.parseInt(br.readLine());

		for (int i=1; i<=row; i++){
			int num = 1;
			for (int sp=1; sp<i; sp++){
				System.out.print("\t");
			}
			for (int j=1; j<=(row-i)*2+1; j++){
				System.out.print(num++ +"\t");
			}
			System.out.println();
		}
	}
}


