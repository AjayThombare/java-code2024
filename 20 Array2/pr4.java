// WAP to search a specific elemen in an array and return its index. Ask the user to provide the number to search, also take size and elements input from the user.
//
import java.util.*;
class P4{
	public static void main(String[] args){
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter size : ");
        	int size = sc.nextInt();
        	int arr[] = new int[size];
         	System.out.print("Enter element : ");
        	for (int i=0; i<size; i++){
         	        arr[i] = sc.nextInt();
        	}
		System.out.print("Enter Spesific number : ");
		int num = sc.nextInt();

        	for (int i=0; i<size; i++){
                	if (num == arr[i]){

				System.out.println(num + " found at index "+i);
			}
		}
	}
}

