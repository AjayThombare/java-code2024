// WAP to print the sum of odd and even number in an array
// 10 15 9 1 12 15  (Odd sum=40 & Even sum=22)

import java.util.*;
class P2{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter size : ");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.println("Enter element : ");
                for (int i=0; i<size; i++){
                        arr[i] = sc.nextInt();
                }
		int sum1 = 0;
		int sum2= 0 ;
                for (int i=0; i<size; i++){
                        if (arr[i]%2==0){
				sum1 = sum1+arr[i];
			}
			else {
				sum2=sum2+arr[i];
			}
		}

		System.out.println("sum of even element is : "+ sum1);
		System.out.println("sum of odd element is : "+ sum2);
	}
}


