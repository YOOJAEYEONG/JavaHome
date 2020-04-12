package ex13E01interface.figure;


public class Triangle extends FigureData implements IFigure,IDrawable{

	public Triangle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public void draw(String figureName) {
		System.out.println(figureName + "을 그려봅니다.");
	}
	
	@Override
	public void area(String figureName) {
		System.out.println(figureName+"의 면적은 : " 
				+ width*height*0.5);	
	}
}