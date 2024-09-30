// WAP to tske a number from the user and store each element in an array by increasing the element by one
// input   1 5 6 9 8 7 2 3 6 5 
// output  2 6 7 10 9 8 3 7 6

import java.util.*;
class P9{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<size; i++){
			System.out.print((arr[i]+1 )+ "  ");
		}
	}
}

