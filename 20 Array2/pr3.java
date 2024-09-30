// WAP to check if there is any vowel in the array of characters if present then print its index, where you haave to take the size and elements from user
//
import java.util.*;
class P3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array : ");
		int size = sc.nextInt();

		char arr[] = new char[size];

		System.out.print("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.next().charAt(0);
			
		}
		for (int i=0; i<size; i++){
			if (arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U' || arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
				System.out.println("vowel "+arr[i] +" found at index :"+ i);
			}
		}

	}
}

