// take the input from the user where the size of the array should be 10 and print the output of the user given element of an array
//
import java.util.*;
class P2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("enter size of array : ");
		int size = sc.nextInt();

		int arr[] = new int [size];
		System.out.println("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<size; i++){
			System.out.print(arr[i]+ " ");
		}
	}
}

