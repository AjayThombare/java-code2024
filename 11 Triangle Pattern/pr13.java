// 65  B   67  D
// B   67  D
// 67  D
// D 
//
import java.io.*;
class P13{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter row : ");
                int row = Integer.parseInt(br.readLine());
                for (int i=1; i<=row; i++){
                        int num = 64+i;
			//int x = i;
                        for (int j=1; j<=row-i+1; j++){
                                if (num%2==1){
					System.out.print(num++ + " ");
					//System.out.print((char) (num++) + " ");
				}
				else {
					System.out.print((char)(num++) + " ");
				}
			
                        }
                        System.out.println();
                }
        }
}
