// WAP to print the occurence of a given user character 
//
import java.util.*;
class P8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		char arr[] = new char[size];
		System.out.println("Enter element : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.next().charAt(0);
		}
		int count = 0;
		System.out.print("Enter character : ");
		char ch = sc.next().charAt(0);
		for (int i=0; i<size; i++){
			if (ch == arr[i]){
				count++;
			}
		}
		System.out.println(ch+" occures "+ count + " times in array");
	}
}


