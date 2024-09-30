// WAPTP sum of odd element in an array. Take input from the user

import java.util.*;
class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		
		System.out.println("enter element : ");

		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i=0; i<size; i++){
			if (arr[i]%2==1){
				sum = sum+arr[i];
			}
		}
		System.out.println("Sum of odd elements : "+ sum);
	}
}

