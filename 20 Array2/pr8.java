// WAP to print the elements in an array which are greater than 5 but less than 9, where you have to take the size and elements from the user.
//
import java.util.*;
class P8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i=0; i<size; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<size; i++){
			if (arr[i]>5 && arr[i]<9){
				System.out.println(arr[i] + " is greater than 5 but less than 9 ");
			}
		}
	}
}

