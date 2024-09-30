// WAP to print the product of odd index elements in an array. Where you have to take size input and elements input from the user.
//
import java.util.*;
class P6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i=0; i<size; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		int pro = 1;
		for (int i=0; i<size; i++){
			if (i%2==1){
				pro = pro*arr[i];
			}
		}
		System.out.println("product of odd index elements is : "+ pro);
	}
}


