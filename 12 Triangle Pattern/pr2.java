// 9 
// 9 9 
// 9 9 9 
// 9 9 9 9 
//
import java.io.*;
class P2{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row : ");
		int row = Integer.parseInt(br.readLine());
		int num = 9;		
		for (int i=1; i<=row; i++){
			//int num = 9;
			for (int j=1; j<=i; j++){
				//Syste.out.print("9 ");
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}

