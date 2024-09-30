 // WAP to find the first occurrence of a specific number in an array. Print the index of a first occurrence
 // elements  1 5 9 8 7 6
 // input  Specific number is 5 
 // output  num 5 first occured at index 1
import java.util.*;
class P2{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i=0; i<size; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Specific number is : ");
		int num = sc.nextInt();
		int cnt = 0;
		for (int i=0; i<size; i++){
			if (num==arr[i]){
				System.out.println("num " + num + " first occured at index "+i);
				cnt++;
				//break;
			}
			/*else {
				System.out.println("num not found in an index " );
			}
*/
		}
		
		if (cnt<=0){
			
			System.out.println("num not found in an index " );
		}
	}
}

