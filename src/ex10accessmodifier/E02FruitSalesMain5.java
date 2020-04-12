package ex10accessmodifier;

class FruitSeller3{
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
	
	public FruitSeller3(int money, int appleNum, int price) {
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
		System.out.println("판매자의 남은 사과 : " + numOfApple);
		System.out.println("판매자의 판매수익 : " + myMoney);
	}
}

class FruitBuyer3{
	int myMoney;
	int numOfApple;
	
	public FruitBuyer3(int myMoney, int numOfApple) {
		this.myMoney = myMoney;
		this.numOfApple = numOfApple;
	}
	public void buyApple(FruitSeller3 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("구매자 현재잔액 : "+myMoney);
		System.out.println("구매자 사과갯수 : " + numOfApple);
	}
}
public class E02FruitSalesMain5 {

	public static void main(String[] args) {

		FruitSeller3 seller1 = new FruitSeller3(0, 100, 1000);
		
		FruitBuyer3 buyer1 = new FruitBuyer3(5000, 0);
		
		buyer1.showBuyResult();
		seller1.showSaleResult();
		buyer1.buyApple(seller1, 5000);
		
		buyer1.showBuyResult();
		seller1.showSaleResult();
		
	}

}
























