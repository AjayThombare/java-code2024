// WAP to print the count of digits in elements of an array.
// element  1  225  32  356
// output   1   3    2   3
//
import java.util.*;
class P5{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
	
		for (int i=0; i<size; i++){
			int num = arr[i];
			int cnt = 0;
			int rem = 0;
			while (arr[i]>0){
				rem = arr[i]%10;
				arr[i] = arr[i]/10;
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}


