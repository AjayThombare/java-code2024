class P5{
	public static void main(String []args){
		int num = 7;
		while (num>=0){
			if (num>=1){
				System.out.println(num + "  Day Remaining");
			}
			else {
				System.out.println(num + "  Day Assignment is overdayd");
			}
			num--;
		}
	}
}

