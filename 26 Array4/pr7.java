// WAP to convert lowercase character to UPPERCASE character.
//
import java.util.*;
class P7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		char arr[] = new char[size];
		
		System.out.println("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.next().charAt(0);
		}
		for (int i=0; i<size; i++){
			if (arr[i]

