//WAPT count the odd digit and even digit in the given number 

/*class P4{
	public static void main(String[] args){
		int num = 21436789;
		int cnt = 0;
		int rem = 0;
		while (num>0){
			rem=num%10;
			num=num/10;
			if (rem%2==1){
				System.out.println(cnt+1);
			}
		}
	}
}*/

class P4{
	public static void main(String[] args){
		int num = 21436789;
		int cnt1 = 0;
		int cnt2 = 0;
		int rem = 0;
		while (num>0){
			rem=num%10;
			num=num/10;
			if (rem%2==0){
				cnt1=cnt1+1;
			}
			else {
				cnt2=cnt2+1;
			}
		}
		
		System.out.println("Count of even number is : " + cnt1);
		System.out.println("Count of odd number is : " + cnt2);
	}
}



				


