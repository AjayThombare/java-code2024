// print the prime numbers in an array 
// 5 7 9 11 15 19 90
// output 5 7 11 19
//
import java.util.*;
class P9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter element: ");
		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<size; i++){
			int cnt = 0;
			for (int j=1; j<size; j++){
				if (arr[i]%j==0){
					cnt++;
				}
			}
			if (cnt<2){
				System.out.print("composite number "+ arr[i] + "  ");
			}
		}
	}
}

