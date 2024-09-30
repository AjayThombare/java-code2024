// WAP to take input from the user for size and elements of an array. print the average of array element
//
import java.util.*;
class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i=0; i<size; i++){
			sum = sum+arr[i];
		}
		System.out.println("Array element average "+sum/size);
	}
}

