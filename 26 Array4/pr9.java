// WAP to replace the element with #, which are not in the range 'a to z'.
//
import java.util.*;
class P9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size :");
		int size = sc.nextInt();
		char arr[] = new char[size];
		System.out.println("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.next().charAt(0);
		}
		for (int i=0; i<size; i++){
			if (arr[i]>='A' && arr[i]<='Z'){
				System.out.print("#  ");
			}
			else {
				System.out.print(arr[i]+"  ");
			}
		}
	}
}

