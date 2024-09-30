// WAP to print all the consonants in an array 
// a  b  c  y  x  o  p
// output  b c y x p
//
import java.util.*;
class P6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array : ");
		int size = sc.nextInt();

		char arr[] = new char[size];

		System.out.println("Enter elements : ");

		for (int i=0; i<size; i++){
			arr[i] = sc.next().charAt(0);
		}
		for (int i=0; i<size; i++){
			if (arr[i]!='a' && arr[i]!='e' && arr[i]!='i' && arr[i]!='o' && arr[i]!='u' && arr[i]!='A' && arr[i]!='E' && arr[i]!='I' && arr[i]!='O' && arr[i]!='U'){
				System.out.print(arr[i]+"  ");
			}
		}
	}
}

