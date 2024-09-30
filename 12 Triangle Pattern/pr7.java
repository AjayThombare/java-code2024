// 1 
// 2 a 
// 3 b 3 
// 4 c 4 d
//
import java.io.*;
class P7{
	public static void main(String[] args)throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter row : ");
                int row = Integer.parseInt(br.readLine());
                char ch = 97;
                for (int i=1; i<=row; i++){
                        
                        for (int j=1; j<=i; j++){
                                if (j%2==1){
                                        System.out.print(i + "  ");
                                }
                                else {
                                        System.out.print((char)(ch) + "  ");
                                	ch++;
					//System.out.print((char)(ch+i)+ " ");
				}
                                
                        }
                        System.out.println();
                }
        }
}
