package ex08class;

class FruitSeller{
	
	int numOfApple = 100;//판매자의 사과 보유갯수
	int myMoney = 0;//판매자의 수익
	final int APPLE_PRICE = 1000;//사
	
	
	public int saleApple(int money) {
		
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("판매가]남은사과갯수:"+numOfApple);
		System.out.println("판매자]판매수익"+myMoney);
	}
}
class FruitBuyer{
	int myMoney = 5000;
	int numOfApple = 0;
	
	public void buyApple(FruitSeller aa, int money) {
		myMoney -= money;
		numOfApple += aa.saleApple(money);
	}
	public void showBuyResult() {
		System.out.println("구매자]현재잔액:"+myMoney);
		System.out.println("구매자]사과갯수"+numOfApple);
	}
}




public class E06FruitSalesMain1 {

	public static void main(String[] args) {

		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
		
//		구맺자가 판매자에게 5000원을 지불하고 사과를 구매한 행위를 코드로 표현함
		buyer.buyApple(seller, 5000);
		
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
	}

}
