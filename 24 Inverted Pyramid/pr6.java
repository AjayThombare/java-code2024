// A A A A A A A
//   B B B B B
//     C C C
//       A
//
import java.io.*;
class P6{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter row : ");
		int row = Integer.parseInt(br.readLine());

		for (int i=1; i<=row; i++){
			int num = 65+i-1;
			for (int sp=1; sp<i; sp++){
				System.out.print("\t");
			}
			for (int j=1; j<=(row-i)*2+1;  j++){
				System.out.print((char)(num) + "\t");
			}
			System.out.println();
		}
	}
}

