// WAP where you have to take input from the user for a character array and print the character 
//
import java.util.*;
class P6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size : ");
		int size = sc.nextInt();

		char arr[] = new char[size];

		System.out.print("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.next().charAt(0);
		}
		for (int i=0; i<size; i++){
			System.out.print(arr[i]+" ");
		}
	}
}

				

