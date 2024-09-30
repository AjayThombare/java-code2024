//WAPTTp the sum of digits in the given number

class P5{
	public static void main(String[] args){
		long num = 9307922405L;
		long rem = 0L;
		long sum = 0L;
		while (num>0){
			rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		System.out.println(sum);
	}
}

