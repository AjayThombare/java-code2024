// WAp to find difference between minimun and maximum element in an array. take input from user
//
import java.util.*;
class P2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		for (int i=0; i<size; i++){
			if (arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println("min : "+min);
		int max = arr[0];
		for (int i=0; i<size; i++){
			if (arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("max : "+max);
		System.out.println("difference between minimum and maximum element : "+(max-min));
	}
}

