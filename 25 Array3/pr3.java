// WAP to find the number of occurence of a specific number in an array. Print the count of occurences .

import java.util.*;
class P3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.print("enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Specific number : ");
		int num = sc.nextInt();

		int count = 0;

		for (int i=0; i<size; i++){
			if (num==arr[i]){
				count++;
			}
		}
		if (count>=1){
			System.out.println("num "+num +" found " +count + " times");
		}
		else {
			System.out.println(" num "+ num +" not found in array ");
		}

	}
}




						
		
