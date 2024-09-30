// d c b a 
// d c b a 
// d c b a 
// d c b a

class P7{
	public static void main(String[] args){
		for (int i=1; i<=4; i++){
			char ch = 'd';
			for (int j=1; j<=4; j++){
				System.out.print(ch-- + " ");
			}
			System.out.println();
		}
	}
}



