package ex03operator;

public class Qu_03 {

	public static void main(String[] args) {

		int radius = 10;		
		double area = radius * radius * 3.14;
		
		System.out.println("area_int: "+ (int)area + "mm��");
		System.out.println("area_float: "+ (float)area + "mm��");
		System.out.printf("area_double: %.2fmm��", area);
	}

}
