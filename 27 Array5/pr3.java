// WAP to check if an array is a palindrome or not
//  1 2 3 3 2 1 
//  
import java.util.*;
class P3{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter size : ");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.println("Enter element : ");
                for (int i=0; i<size; i++){
                        arr[i] = sc.nextInt();
                
		}
		int temp = arr[0];
                for (int i=0; i<size/2; i++){
			//if (arr[i] == arr[size-i-1]){
			//temp = arr[i]; 
			arr[i] = arr[size-1-i];
			arr[size-1-i]=temp;
			}
			/*else {
				flag = 1;
			}
		}
		if (flag == 0){
			System.out.println("Palindrome " );
		}
		else {

			System.out.println("not Palindrome " );
		*/
	}
}

	


