// WAP to print the product of prime elements in an array 
// 1 4 5 6 11 9 10
// output 55

import java.util.*;
class P10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter element : ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int pro = 1;
        for (int i=0; i<size; i++){
            int cnt = 0;
            for (int j=1; j<size; j++){
                if (arr[i]%2==0){
                    cnt++;
                }
            }
            if (cnt<2){
                pro = arr[i]*pro;
            }
        }
        System.out.println("product of composite number "+ pro);
    }

}


