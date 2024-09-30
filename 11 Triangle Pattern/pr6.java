// 3 
// 3 6 
// 3 6 9
// 3 6 9 12
//
import java.io.*;
class P6{
	public static void main(String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter row : ");
                int row = Integer.parseInt(br.readLine());
                for (int i=1; i<=row; i++){
                        int num = row;
			for (int j=1; j<=i; j++){
                                System.out.print(num*j + "  ");
                        }
                        System.out.println();
                }
        }
}

