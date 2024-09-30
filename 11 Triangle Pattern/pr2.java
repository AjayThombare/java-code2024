//1
//1 2 
//1 2 3
//1 2 3 4
//
import java.io.*;
class P2{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter row : ");
		int row = Integer.parseInt(br.readLine());
		for (int i=1; i<=row; i++){
			int num = 1;
			for (int j=1; j<=i; j++){
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
}

