 // WAP to add 15 in all elements of the array and print it 
 // input  : 10 20 30 40 50 60 70
 // output : 25 35 45 55 65 75 85
 //
import java.util.*;
class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i=0; i<size; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		int num = 15;
		for (int i=0; i<size; i++){
			System.out.println(num+arr[i]);
		}
	}
}


