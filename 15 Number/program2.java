class P2{
	public static void main(String[] args) {

		int count = 0;
		int num1 = 6; 
		int num2 = 1;
		while(num1>=num2) {
			if(num1%num2 == 0) {
				count++;
			}
			num2++;
		}
		if(count == 2) {
			System.out.println(num1+" is prime number");

		}
		else{
			System.out.println(num1+" is not prime number");
		}
	}
}
