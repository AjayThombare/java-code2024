// WAPTP the array with minimum 10 elements data 
// 10 20 30 40 50 60 70 80 90 100
//
import java.util.*;
class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("size of array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		
		System.out.println("Enter element : ");

		for (int i=0; i<size; i++){
			//System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<size; i++){
			System.out.print(arr[i]+ " ");
		}
	}
}

