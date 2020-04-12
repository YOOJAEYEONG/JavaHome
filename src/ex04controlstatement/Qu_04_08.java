package ex04controlstatement;

public class Qu_04_08 {
/*
	����3] ������ ���� ����� ����ϴ� ���α׷��� for������ �ۼ��Ͻÿ�.
	���ϸ� : Qu_04_08.java
	���]	
	* * * * *
	* * * *
	* * *
	* *
	*
*/
	public static void main(String[] args) {

		int length = 5;
		
		for(int height = 5; height > 0 ; height--) {
			for( length = height ; length > 0 ; length--) 
				System.out.print("* ");
			System.out.println();
		}
	}
}
