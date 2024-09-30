// WAP to print the array, if the user given size of an array is even then print the alternate elements in an array, else print the whole array.
//
import java.util.*;
class P7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i=0; i<size; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<size; i++){
			if (size%2==0){
				if (i%2==0){
					System.out.println(arr[i]);
				}
			}
			else {
				System.out.println(arr[i]);
			}
		}
	}
}

		
