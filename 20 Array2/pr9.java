// WAP to print the minimum element in the array, where you have to take the size and elements from the user.
//
import java.util.*;
class P9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i=0; i<size; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		for (int i=0; i<size; i++){
			if (arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println("Minimum number in the array is " +min);
	}
}

