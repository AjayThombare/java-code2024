// c 
// C B
// c b a
// 
import java.io.*;
class P4{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row: ");
		int row = Integer.parseInt(br.readLine());

		for (int i=1; i<=row; i++){
			int num1 = 67;
			int num2 = 100;
			for (int j=1; j<=i; j++){
				if (i%2==1){
					System.out.print((char)(num2-j)+" ");
				}
				else {
					System.out.print((char)(num1-j)+ " ");
				}
			}
			System.out.println();
		}
	}
}

