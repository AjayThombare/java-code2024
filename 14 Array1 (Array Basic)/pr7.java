//WAPTP the element of the array which is divisible by 4. Take input from user.
// 14 20 18 9 11 51 16 2 8 10
//
import java.util.*;
class P7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.print("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<size; i++){
			if (arr[i]%4==0){
				System.out.print(arr[i]+" ");
			}
		}
	}
}



