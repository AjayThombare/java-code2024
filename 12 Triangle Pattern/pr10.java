// 1 
// b c 
// 4 5 6 
// g h i j
//
import java.io.*;
class P10{
        public static void main(String[] args)throws IOException{
                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter row : ");
                int row = Integer.parseInt(br.readLine());
                char ch = 97;
		int num = 1;
                for (int i=1; i<=row; i++){
                        for (int j=1; j<=i; j++){
                                if (i%2==1){
                                        System.out.print(num + "  ");
                                }
                                else {
                                        System.out.print((char)(ch) + "  ");
                                        //ch++;
                                        
                                }
				ch++;
				num++;
                        }
                        System.out.println();
                }
        }
}
