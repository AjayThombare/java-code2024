// 1
// B C 
// 1 2 3 
// G H I J
//

import java.io.*;
class P6{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row : ");
		int row = Integer.parseInt(br.readLine());
		int num1 = 65;
		for (int i=1; i<=row; i++){
			int num = 1;
			for (int j=1; j<=i; j++){
				if (i%2==1){
					System.out.print(num++ +"  ");
					
				}
				
				else {
					System.out.print((char)(num1+j)+ "  ");
				}
				num++;
			}
			//num1++;
			System.out.println();
		}
	}
}


