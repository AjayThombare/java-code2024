// WAP to take number from a user and check number is palindrome or not

import java.util.*;
class P1{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		int rem = 0;
		while (num>0){
			rem = num%10;
			rev = rem+rev*10;
			num = num/10;
		}
		if (rev==temp){	
			System.out.println("Number is palindrome ");
		}
		else {
			System.out.println("Number not a palindrome ");
		}
	}
}


