// D 
// E F 
// G H I
// J K L M
//
import java.io.*;
class P5{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row : ");
		int row = Integer.parseInt(br.readLine());
		//System.out.print("Enter char : ");
		//String ch = br.readLine();
		char ch = 'D'; 
		for (int i=1; i<=row; i++){
			for (int j=1; j<=i; j++){
				System.out.print(ch++ + " ");

			}
			System.out.println();
		}
	}
}

