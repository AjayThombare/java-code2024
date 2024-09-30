// WAPTP the even element in the array. Take input from user 
// 10 11 12 13 14 15 16 17 18 19 
//

import java.util.*;
class P3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array :");
		int size = sc.nextInt();
		
		int arr[] = new int[size];

		for (int i=0; i<size; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}


		for (int i=0; i<size; i++){
			if (arr[i]%2==0){
				System.out.print(arr[i]+ " ");
			}
		}
	}
}

