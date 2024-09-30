// D C B A
// D C B 
// D C  
// D
//
import java.io.*;
class P12{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter row : ");
                int row = Integer.parseInt(br.readLine());
                for (int i=1; i<=row; i++){
                        char ch = 'D';
                        for (int j=1; j<=row-i+1; j++){
                                System.out.print(ch-- + " ");
                        }
                        System.out.println();
                }
        }
}
      
