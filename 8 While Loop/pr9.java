class P9{
	public static void main(String[] args){
		int num = 1;
		while (num<=6){
			if (num%2==1){
				System.out.print((char) (64+num) + "  ");
			}
			else {
				System.out.print(num + "  ");
			}
			num++;
		}
	}
}
