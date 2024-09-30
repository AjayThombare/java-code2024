// WAP to print the sum of odd indexed elements, in an array. Where you have to take size input and elements input from the user.
//
import java.util.*;
class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i=0; i<size; i++){
			System.out.print("Enter Element : ");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i=0; i<size; i++){
			if (i%2==1){
				sum = sum+arr[i];
			}
		}
		System.out.println(" Sum of odd index elements is : "+sum);
	}
}



