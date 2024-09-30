// 1 2 3 4 
// 2 3 4 5 
// 3 4 5 6 
// 4 5 6 7

class P10{
	public static void main(String[] args){
		for (int i=1; i<=6; i++){
			int num = i;
			for (int j=1; j<=6; j++){
				System.out.print(num++ + "     ");
			}
			System.out.println();
		}
	}
}

