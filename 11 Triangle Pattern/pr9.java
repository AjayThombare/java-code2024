// 4 4 4 4
// 3 3 3 
// 2 2 
// 1
//
import java.io.*;
class P9{
	public static void main(String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter row : ");
                int row = Integer.parseInt(br.readLine());
                int num = row;
		for (int i=1; i<=row; i++){
			
                        for (int j=1; j<=row-i+1; j++){
                                System.out.print(num  +"  ");
			}
			num--;
                        System.out.println();
                }
        }
}

