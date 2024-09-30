// WAP to print the character in an array which comes before the user given character.
//
import java.util.*;
class P10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter sixe of array : ");
		int size = sc.nextInt();
		char arr[] = new char[size];
	        System.out.println("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.next().charAt(0);
		}
		System.out.print("Enter char : ");
		char ch = sc.next().charAt(0);
		for (int i=0; i<size; i++){
			if (ch==arr[i]){
				break;
			}
			else {
				System.out.println(arr[i]);
			}
		}
	}
}

