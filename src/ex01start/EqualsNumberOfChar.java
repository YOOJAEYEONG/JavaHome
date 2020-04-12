package ex01start;


public class EqualsNumberOfChar{
	
	public static void main(String[] args) {
		
		String s = "ppoooYy";
		int y=0;
		int p=0;
		for(int i=0; i<s.length() ; i++) {
			if( "y".equalsIgnoreCase(String.valueOf(s.charAt(i)))) {
				y++;
			}
			if( "p".equalsIgnoreCase(String.valueOf(s.charAt(i)))) {
				p++;
			}
			
			

			
		}
		System.out.println(y==p? true : false);
	}
}