//WAPTP the numbers in the range 100-24 which are divisible by 4 and 5

class P10{
	public static void main(String [] args){
		int num = 100;
		while (num>=24){
			if (num%4==0 && num%5==0){
				System.out.println(num);
			}
			num--;
		}
	}
}

