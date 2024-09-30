// WAP where you have to store the employee's age working at company,take count of employees from the user. Take input from the user
//
import java.util.*;
class P8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();

		float age[] = new float[size];
		String compName[] = new String[size];

		for (int i=0; i<size; i++){
			System.out.print("Enter age of employee : ");
			age[i] = sc.nextFloat();

			System.out.print("Enter company name : ");
			compName[i] = sc.next();
		}
		for (int i=0; i<size; i++){
			System.out.println("Employee age "+ age);
			System.out.println("compName : "+compName);
		}
	}
}


