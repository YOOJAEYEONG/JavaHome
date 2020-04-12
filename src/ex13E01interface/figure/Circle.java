package ex13E01interface.figure;

public class Circle implements IFigure, IDrawable{
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw(String figureName) {
		System.out.println(figureName+"을 그립니다.");
	}
	@Override
	public void area(String figureName) {
		System.out.println(figureName+"의 면적"+ radius*radius*Math.PI);
	}
}