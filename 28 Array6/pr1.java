// WAP to check whether the given array is desending or not
// input 15 9 5 1 
// output desending order 
//
import java.util.*;
class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		int flag = 0;
		int temp = arr[0];
		for (int i=0; i<size; i++){
		       if (temp>=arr[i]){
			       temp = arr[i];
		       }
		       else {
			       flag = 1;
		       }
		}
		if (flag==0){
			System.out.println(" array in desendin order ");
		}
		else {

			System.out.println(" array not in desendin order ");
		}
	}
}


