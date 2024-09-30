// WAP to convert all negative number into their square in a given array  
//
/*import java.io.*;
class P5{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size : ");
		int size = Integer.parseInt();

		int arr[] = new int[size];

		for (int i=0; i<size; i++){
			System.out.print("Enter element : ");
			arr[i] = Integer.parseInt(br.readLine());

		}
		for (int i=0; i<size; i++){
			if (arr[i]<0){
				System.out.print(arr[i]*arr[i]+"\t");
			}
		}
	}
}*/

import java.util.*;
class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i=0; i<size; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<size; i++){
			if (arr[i]<0){
				System.out.print(arr[i]*arr[i]+"  ");
			}
			else {
				System.out.print(arr[i]+"  ");
			}

		}
	}
}


