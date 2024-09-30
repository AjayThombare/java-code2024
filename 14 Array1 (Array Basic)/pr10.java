// Write a real time example where you have to use the array. Take input from the user
//
import java.util.*;
class P10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();

		int roomNo[] = new int[size];	// real time example => Room no.

		for (int i=0; i<size; i++){
			System.out.print("Enter element : ");
			roomNo[i] = sc.nextInt();
		}
		for (int i=0; i<size; i++){
			System.out.println("RoomNo : "+roomNo[i]);
		}
	}
}


