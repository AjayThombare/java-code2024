class P4{
	public static void main(String[] args){
		float per = 95.00f;
		if (per>85.00){
			System.out.println("Medical");
		}
		else if (per<=85.00 || per>75.00){
			System.out.println("Engineering");
		}
		else if (per<=75.00 || per>=65.00){
			System.out.println("Pharmacy or Bachelor in Science");
		}
		else {
			System.out.println("At Home");
		}
	}
}


