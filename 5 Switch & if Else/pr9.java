class P9{
	public static void main(String[] args){
		int Eng = 90;
		int Hin = 95;
		int Math = 96;
		int His = 91;
		int Bio = 85;

		//int add = Eng+Hin+Math+His+Bio;
		

		if (Eng+Hin+Math+His+Bio > 400){
			System.out.println("First class with distinction ");
		}
		
		else if (Eng+Hin+Math+His+Bio > 300){
			System.out.println("First clas ");
		}
		else if (Eng+Hin+Math+His+Bio > 250){
			System.out.println("Second class");
		}
		else {
			System.out.println("You failed the exam");
		}
		
		//System.out.println(add);
	}
}


