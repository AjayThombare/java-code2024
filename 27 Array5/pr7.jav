// WAP to find the composite number in an array
// input  10  22  3  31  50  3
// output  10  22  50
//
import java.util.*;
class P7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
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
			
				if (cnt>2){
					System.out.println(arr[i] +"  ");
				}

			}
			/*if (cnt>2){
				System.out.println(arr[i] +"  ");
			}*/
		}
	}
}

 
