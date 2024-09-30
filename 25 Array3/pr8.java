// Print the composite number in an array 
// 4 5 7 9 10  
// Output 4 9 10
//
import java.util.*;
class CompositeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter element : ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<size; i++){
            int cnt = 0;
            for (int j=1; j<size; j++){
                if (arr[i]%j==0){
                    cnt++;
                }
            }
            if (cnt>2){
                System.out.print(arr[i] +" ");
            }
        }
    }
    
}


