package ex17collection;


class Apple{
	int weight;
	public Apple(int weight) {
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println("사과무게 : "+ weight);
	}
}////////////////////////////////
class Bananer{
	int suger;
	public Bananer(int sugar) {
		this.suger = sugar;
	}
	public void showInfo() {
		System.out.println("바나나의 당도: "+suger);
	}
}//////////////////////////////////

class GenericFruitBox<CustomType>{
	
	CustomType item;
	
	public void store(CustomType item) {
		this.item = item;
	}
	public CustomType pullOut() {
		return item;
	}
}/////////////////////////////////////

public class Ex02GenericClass {

	public static void main(String[] args) {
		
		GenericFruitBox<Apple> appleBox =
				new GenericFruitBox<Apple>();
		appleBox.store(new Apple(10));
		
		
		Apple apple = appleBox.pullOut();
		apple.showInfo();//사과 무게 : 10
		
		GenericFruitBox<Bananer> bananerBox =
				new GenericFruitBox<Bananer>();
		bananerBox.store(new Bananer(20));
		
		Bananer bananer = bananerBox.pullOut();
		bananer.showInfo();//바나나의 당도 : 20
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}































