package ex04controlstatement;
/*
����1] ������ ���� ����� ����ϴ� ���α׷��� while������ �ۼ��Ͻÿ�.
���ϸ� : Qu_04_06.java
���]
	*
	* *
	* * *
	* * * *
	* * * * *
 */
public class Qu_04_06 {

	public static void main(String[] args) {
		
		int count = 1, length = 1;

		while (count++ <= 5) {	
			while (length-- > 0) 
				System.out.print("* ");
			System.out.println();
			length = count;
		}
	}
}