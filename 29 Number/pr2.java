// WAP to check whether the given number is a perfect number or not
//
import java.util.*;
class P2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i=1; i<num; i++){
			if (num%i==0){
				sum = sum+i;
			}
		}
		if (sum==num){
			System.out.println("perfect number");
		}
		else {
			System.out.println("not a perfect number");
		}
	}
}


