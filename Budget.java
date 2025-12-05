class Budget{
	public static void main(String[] args){
    int amount = 50000;	
    mobilePurchase(amount);
	}
	public static void mobilePurchase(int amount){
		if(amount >= 50000){
			System.out.println("Buy a onepluse mobile");
		}
		else if(amount <= 40000) {
			System.out.println("Buy a samsung mobile");
		}
		else if(amount  <= 30000) {
			System.out.println("Buy a oppo mobile");
		}
		else if(amount <= 20000){
			System.out.println("Buy a redmie mobile");
		}
		else{
			System.out.println("unavilable of mobile");
		}
		}
	}