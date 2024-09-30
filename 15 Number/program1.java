
class P1{
	public static void main(String[] args){
		int num = 12;
		int num1 = 1;
		while(num>=num1) {
			if(num % num1 == 0) {
				System.out.print(num1 + " ");
				num1++;
			}
			else{
				num1++;
			}
		}
	}
}
