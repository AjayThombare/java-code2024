// WAP to convert all even number into 0 and odd number into 1 in a given array 
//
import java.util.*;
class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i=0; i<size; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<size; i++){
			if (arr[i]%2==0){
				System.out.print("0"+"\t");
			}
			else {
				System.out.print("1"+"\t");
			}
		}
	}
}

