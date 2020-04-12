package ex10accessmodifier;

class FruitSeller{
	
	private int numOfApple;
	private int myMoney;
	private final int APPLE_PRICE;
	
	public FruitSeller(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
		
	}
	
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("판매자의 남은 사과갯수 : "+ numOfApple);
		System.out.println("판매자의 판매수익" + myMoney);
	}
}

class FruitBuyer{
	
	private int myMoney;
	private int numOfApple;
	
	public FruitBuyer(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	public void buyApple(FruitSeller seller, int money) {
	
		numOfApple = seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("구매자 현재 잔액" + myMoney);
		System.out.println("구매자 사과갯수 " + numOfApple);
	}
}

public class E03InformationHiding {

	public static void main(String[] args) {
		
	
	//판매자 
	FruitSeller seller1 = new FruitSeller(0, 100, 1000);
	
	//구매자
	FruitBuyer buyer = new FruitBuyer(10000, 0);
	
	System.out.println("구매행위가 일어나기전의 상태");
	
	seller1.showSaleResult();
	buyer.showBuyResult();
	
	buyer.buyApple(seller1, 6000);
	
	seller1.showSaleResult();
	buyer.showBuyResult();
	}
}





























