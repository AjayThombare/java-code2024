//WAPTP the odd digits of given number

class P3{
	public static void main(String[] args){
		int num = 216985;
		int rem = 0;
		while (num>0){
		rem = num%10;
		num = num/10;
		if (rem%2==1){

			System.out.println(rem);
		}

		}
	}
}

