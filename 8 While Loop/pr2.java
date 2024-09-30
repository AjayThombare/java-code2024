class P2{
	public static void main(String[] args){
		int num = 93079224;
		int cnt = 0;
		int rem = 0;
		while (num>0){
			rem=num%10;
			num=num/10;
			cnt=cnt+1;
			//System.out.println(cnt);
			//cnt=cnt+1;
		}
		System.out.println(cnt);		
	}
}

