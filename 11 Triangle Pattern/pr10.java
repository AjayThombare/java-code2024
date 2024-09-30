// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 
//

import java.io.*;
class P10{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter row : ");
                int row = Integer.parseInt(br.readLine());
                for (int i=1; i<=row; i++){
                        int num = 1;
                        for (int j=1; j<=row-i+1; j++){
                                System.out.print(num++ + " ");
                        }
                        System.out.println();
                }
        }
}


