class P4{
	public static void main(String[] args){
		char ch = 'A';
		if (ch>=97 && ch<=122){
			System.out.println( ch +  " is lower case");
		}
		else if (ch>=65 && ch<=90){
			System.out.println( ch + " is upper case");
		}
		else{
			System.out.println("default stste");
		}
	}
}

