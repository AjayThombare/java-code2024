// WAP to find second largest element in an array
//
import java.util.*;
class P3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		int max1 = arr[0];
		for (int i=0; i<size; i++){
			if (arr[i]>max1){
				max1 = arr[i];
			}
		}
		System.out.println("first max1 element : "+ max1);
		int max2 = arr[0];
		for (int i=0; i<size; i++){
			if (arr[i]>max2 && arr[i]<max1){
				max2 = arr[i];
			}
		}
		System.out.println("second largest element : "+max2);
	}
}


