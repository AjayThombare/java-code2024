// C1 C2 C3
// C4 C5 C6 
// C7 C8 C9

class P8{
	public static void main(String[] args){
		int num = 1;
		for (int i=1; i<=4; i++){
			for (int j=1; j<=4; j++){
				System.out.print("D"+num++ + " " );
			}
			System.out.println();
		}
	}
}

