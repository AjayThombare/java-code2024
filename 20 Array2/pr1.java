// WAP to count the even number in an array where you have to take the size and elements from the user. And also print the even numbers too
//
import java.util.*;
class P1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i=0; i<arr.length; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for (int i=0; i<size; i++){
			if (arr[i]%2==0){
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println("count : "+ count);

	}
}

