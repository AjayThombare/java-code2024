// WAP where you have to print the odd indexd elements. Take input from the user.
// 1 2 3 4 3 5 6 7 8 9 10
//
import java.util.*;
class P9{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of an arry : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i=0; i<size; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<size; i++){
			if (i%2==1){
				System.out.println(arr[i]);
			}
		}
	}
}


