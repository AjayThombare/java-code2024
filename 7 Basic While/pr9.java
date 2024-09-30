//WAPTP the sum of odd number from 150-101
class P9{
	public static void main(String[] args){
		int sum = 0;

		int num = 150;
		while (num>=101){
			if (num%2==1){
				sum = sum + num;
			}
			num--;
		}
		System.out.println(sum);
	}
}


