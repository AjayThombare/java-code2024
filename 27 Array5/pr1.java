// WAP to check given array in assending order or not .
// (size = 4)      1 5  9 15 
//
import java.util.*;
class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		int flag =0;
		int temp = arr[0];
		for (int i=0; i<size; i++){
			if (temp<=arr[i]){
				temp = arr[i];
			}
			else {
				flag = 1;
			}
		}
		if (flag==0){
			System.out.println("Assending order ");
		}
		else {
			
			System.out.println("array not in Assending order ");
		}
	}
}


