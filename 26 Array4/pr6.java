// WAP to count the vowel & consonants in array 
//
import java.util.*;
class P6{
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
		for (int i=0; i<size; i++){
			if (arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
				count++;
			}
		}
		System.out.println("count of vowel : "+count);
		int count2 = 0;
		for (int i=0; i<size; i++){
			if (arr[i]!='a' && arr[i]!='e' && arr[i]!='i' && arr[i]!='o' && arr[i]!='u'){
				count2++;
			}
		}
		System.out.println("count of consonants : "+count2);

	}
}

