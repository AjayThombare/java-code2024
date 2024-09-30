// WAp to reverse the array. input from user 
//
import java.util.*;
class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<size/2; i++){
			temp = arr[i];
			arr[i] = arr[size-1-i];
			temp = arr[size-1-i];
		}
	}
}

