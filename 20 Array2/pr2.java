// WAP to print the sum of element divisible by 3 in the array, where you have to take the size of the elements from the user 
//
import java.util.*;
class P2{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];

		for (int i=0; i<size; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i=0; i<size; i++){
			if (arr[i]%3==0){
				System.out.println(arr[i]);
				sum = sum + arr[i];
			}
		}
		System.out.println("Sum of element divisible by 3 is : "+sum);

	}
}

