class P7{
	public static void main(String[] args){
		int sellingprice = 1200;
		int costprice = 2200;
		if (sellingprice > costprice){
			System.out.println("profit:"+(sellingprice - costprice));
		}
		else if (sellingprice < costprice){
                        System.out.println("Loss:"+(costprice - sellingprice));
                }
		else {
			System.out.println("No profit and No loss");
		}
	}
}

