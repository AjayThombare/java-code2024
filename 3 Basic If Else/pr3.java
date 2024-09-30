class P3{
	public static void main(String[] args){
		int x = 13;
		if (x%2==1 && x>10){
			System.out.println("13 is an Odd number and greater than 10");
		}
		else if (x%2==0 && x<10){
			System.out.println("Number is Even and Less than 10");
		}
		else if (x%2==0 && x==10){
			System.out.println("Number is Even and Equal to 10");
		}
		else {
			System.out.println("default");
		}

	}
}

