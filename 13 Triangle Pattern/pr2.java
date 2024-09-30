import java.util.*;
class P2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row :");
		int row = sc.nextInt();

		int num = 2;
		for (int i=1; i<=row; i++){
			for (int j=1; j<=row-i+1; j++){
				System.out.print(num + " ");
				num=num+2;
			}
			System.out.println();
		}
	}
}

