package ex10accessmodifier;
/*
정사각형을 의미하는 Square클래스와 직사각형을 의미하는 Rectangle클래스를
정의하고자 한다. 그런데 정사각형은 직사각형의 일종이므로, 다음의 형태로 클래스의 
상속관계를 구성하고자 한다. 아래의 소스를 참조하여 구현하시오. 
 */
//직사각형을 표현한 클래스
class Rectangle
{

	private int ulx, uly;//좌상단(upper left x, upper left y)
	private int lrx, lry;//우하단(lower right x, lower right y)
	private boolean isTrue = true;
	
	public Rectangle() {}
	public Rectangle(int ulx, int uly, int lrx, int lry) {
		if(!isRange(ulx) || !isRange(uly)){
			System.out.println("좌상단 좌표범위가 잘못되었습니다.");
			isTrue = false;
		}
		if(!isRange(lrx) || !isRange(lry) ){
			System.out.println("좌상단 좌표범위가 잘못되었습니다.");
			isTrue = false;
		}
		
		if(ulx>=lrx || uly>=lry) {
			System.out.println("좌측 좌표지정이 잘못됨");
			isTrue = false;
		}
		
		this.ulx = ulx;
		this.uly = uly;
		this.lrx = lrx;
		this.lry = lry;
	}
	
	void ShowAreaInfo() {
		
	}
	
	public boolean isRange(int point) {
		if(point<0 || point>100) {
			return false;
		}
		else {
			return true;
		}
	}
	public void showArea() {
		
		if(!isTrue) {
			System.out.println("좌표값 오류로 넓이 계산이 불가합니다.");
			return;
		}
		int xLength = lrx - ulx;
		int yLength = lry - uly;
		System.out.println("사각형의 넓이 : "+ xLength*yLength);
	}
} 




class QuRectangle
{
	public static void main(String[] args)
	{
     	Rectangle rec1 = new Rectangle(1,1,10,10);
     	rec1.showArea();
     	Rectangle rec2 = new Rectangle(-2,-2,101,101);
     	rec2.showArea();
     	Rectangle rec3 = new Rectangle(10,10,1,1);
     	rec3.showArea();
     	
 	}
}




































