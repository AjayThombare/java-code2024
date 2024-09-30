// WAP to print the maximum element in the array .
//
import java.util.*;
class P10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i=0; i<size; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int var = 0;
		for (int i=0; i<size; i++){
			if (arr[i]>max){
				max = arr[i];
				var++;
			}
		}
		System.out.println("Maximum number in the array found at post "+var+" is "+ max);
	}
}


