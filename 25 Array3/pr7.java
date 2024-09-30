// Check the size of an array and if array size is odd and greater than or equal to 5, then print the odd elements, else print the even numbers
//
import java.util.*;
class P7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Size of an array "+arr.length);
		System.out.println("Enter elements : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<size; i++){
			if (arr.length%2==1 && arr.length>=5){
				if (arr[i]%2==1){
					System.out.print(arr[i]+"  ");
				}
			}
			else {
				if (arr[i]%2==0){
					System.out.print(arr[i]+"  ");
				}
			}
		}
	}
}

