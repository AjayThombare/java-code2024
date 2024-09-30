// 4 
// 4 a 
// 4 b 6  

import java.io.*;
class P9{
        public static void main(String[] args)throws IOException{
                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter row : ");
                int row = Integer.parseInt(br.readLine());
                char ch = 97;
		
                for (int i=1; i<=row; i++){
			int num = 4;
                        for (int j=1; j<=i; j++){
                                if (j%2==1){
                                        System.out.print(num + "  ");
                                	num = num+2;
				}
                                else {
                                        System.out.print((char)(ch) + "  ");
                                        ch++;
                                        //System.out.print((char)(ch+i)+ " ");
                                }
				//num++;

                        }
                        System.out.println();
                }
        }
}
