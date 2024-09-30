// 1 
// 1 c 
// 1 e 3 
// 1 g 3 i
//
import java.io.*;
class P8{
        public static void main(String[] args)throws IOException{
                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter row : ");
                int row = Integer.parseInt(br.readLine());
                char ch = 97;
                for (int i=1; i<=row; i++){

                        for (int j=1; j<=i; j++){
                                if (j%2==1){
                                        System.out.print(j + "  ");
                                }
                                else {
                                        System.out.print((char)(ch) + "  ");
                                }
				ch++;

                        }
		
                        System.out.println();
                }
        }
}
