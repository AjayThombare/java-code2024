// 19 17 15 13 		29 27 25 23 21 
// 11 9  7 		19 17 15 13 
// 5  3			11 9  7 
// 1 			5  3
// 			1
//


import java.util.*;
class P9{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter row :");
                int row = sc.nextInt();

                int num = row*(row+1)-1;
                
		for (int i=1; i<=row; i++){
                        for (int j=1; j<=row-i+1; j++){
                                System.out.print(num + " ");
                                num = num-2;
                        }
                        System.out.println();
                }
        }
}

