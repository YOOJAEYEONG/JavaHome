package ex13E01interface;

import ex13E01interface.figure.Circle;
import ex13E01interface.figure.IDrawable;
import ex13E01interface.figure.IFigure;
import ex13E01interface.figure.Rectangle;
import ex13E01interface.figure.Triangle;

public class E05FigureDrawableMain {
	public static void main(String[] args) {

			
		IFigure figure_cir = new Circle(30);//업캐스팅
		
		figure_cir.area("원");
		((Circle)figure_cir).draw("원");
		
		IFigure figure_rec = new Rectangle(23,12);
		figure_rec.area("사각형");
		((Rectangle)figure_rec).draw("사각형");
		
		IDrawable drawable = new Triangle(17, 34);
		drawable.draw("삼각형");
		((Triangle)drawable).area("삼각형");
		
		
		Circle circle = new Circle(40);
		circle.area("원");
		circle.draw("나도 원");
	}
}

