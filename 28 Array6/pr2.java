// WAP to find sum of all prime umber in an array and also print the count of prime number in an arrray 
// input  5 7 9 12 17 19 21 22
// output 
//
import java .util.*;
class P2{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter element ");
		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i=0; i<size; i++){
			int cnt = 0;
			for (int j=0; j<size; j++){
				if (arr[i]%j==0){
					cnt++;
				}
			}
			//sum = sum+arr[i];
		
			if (cnt<2){
				sum = sum+arr[i];
			//	System.out.println("sum of all prime number is "+ sum +" and count of prime number in array is " + cnt);
			}

		}
		System.out.println("sum of all prime number is " + sum);
		
	}
}




