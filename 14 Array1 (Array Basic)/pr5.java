// WAP where you haave to print the elements from the array which are less than 10. Take input from the user
// 11 2 18 9 10 5 16 20 8 10
//
import java.util.*;
class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size :");
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<size; i++){
			if (arr[i]<10){
				System.out.println(arr[i] + " is less than 10");
			}
		}
	}
}



