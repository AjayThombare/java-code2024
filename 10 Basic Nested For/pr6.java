// 1A 2B 3C 
// 1A 2B 3C
// 1A 2B 3C
//

class P6{
	public static void main(String[] args){
		for (int i=1; i<=3; i++){
			char ch = 'A';
			for (int j=1; j<=3; j++){
				System.out.print("1"+ch++ + " ");
			}
			System.out.println();
		}
	}
}

