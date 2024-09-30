// WAP ro check given number occures more than 2 times or equal 2 times
//
import java.util.*;
class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter num : ");
		int num = sc.nextInt();
		int count = 0;
		for (int i=0; i<size; i++){
			if (num==arr[i]){
				count++;
			}
		}
		if (count>2){
			System.out.print(num +" more than 2 times ");
		}
		else if (count==2){
			System.out.print(num +" equal 2 times " );
		}
		else {
			System.out.print(num +" less than 2 times");
		}
	}
}

