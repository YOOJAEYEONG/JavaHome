package ex15usefulClass;

public class E01WrapperClass2 {

	public static void main(String[] args) {
		
		String strNumber = "1000";
		
		System.out.println("10+strNumber="+(10+strNumber));
		System.out.println("10+strNumber를 숫자로 변경="
				+(10+Integer.parseInt(strNumber)));
		System.out.println("10+strNumber를 숫자로 변경="
				+(10+Integer.valueOf(strNumber)));

		
		String money = "120";
	
		String floatString = "3.1498765432";
		System.out.println("실수형(float)으로 변경:"
				+Float.parseFloat(floatString));
		System.out.println("실수형(double)으로 변경:"
				+Double.parseDouble(floatString));
		System.out.println();
		System.out.println(Character.codePointAt("abcde", 3));
		System.out.println((char)Character.codePointAt("abcde", 3));
		
		System.out.println();
		
		System.out.println(Character.isDigit('A'));
		System.out.println(Character.isDigit('5'));
		System.out.println();
		System.out.println(Character.isLetter('B'));
		System.out.println();
		System.out.println(Character.isWhitespace(' '));
		
		
		String whiteString = "sdl sdl  ";
		int whiteCount = 0;
		
		char[] charr = whiteString.toCharArray();
	
		for(int i = 0; i<charr.length; i++) {
			if(Character.isWhitespace(charr[i])) {
				whiteCount++;
			}
		}
		System.out.println("공백수"+whiteCount);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}




























