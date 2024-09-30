//       D		    C 
//     C D 	          B C
//   B C D		A B C
// A B C D 	          B C
//   B C D		    C
//     C D  
//       D
//

import java.util.*;
class P10{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter row : ");
                int row = sc.nextInt();
                int col = 0;
                int num1 = 64;
                for (int i=1; i<row*2; i++){
                        if (i<row){
                                col = row-i;
                        }
                        else {
                                col = i-row;
                        }
                        for (int sp=1; sp<=col; sp++){
                                System.out.print("\t");
                        }
                        if (i<=row){
                                col = i;
                                int temp = row-i+num1+1;
                                for (int j=1; j<=col; j++){
                                        System.out.print((char)(temp) + "\t");
                                        temp++;
                                }
                        }
                        else {
                                int temp = i-row+num1+1;
                                col = row*2-i;
                                for (int j=1; j<=col; j++){
                                        System.out.print((char)(temp) +"\t");
                                        temp++;
                                }
                        }
                        System.out.println();
                }
	}
}

				


