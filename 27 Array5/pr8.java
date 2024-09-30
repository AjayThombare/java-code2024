// WAP to find second minimum element in an array 
// input  10 2 31 4 0
//
import java.util.*;
class P8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		int min1 = arr[0];
		for (int i=0; i<size; i++){
			if (arr[i]<min1){
				min1 = arr[i];
			}
		}
	//	System.out.println("min1 : " + min1 );
		int min2 = arr[0];
		for (int i=0; i<size; i++){
			if (arr[i]<min2 && arr[i]>min1){
				min2 = arr[i];
			}
		}

		System.out.println("Second minimum number in an array is  : " + min1 );

	}
}

