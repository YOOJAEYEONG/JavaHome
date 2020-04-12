package ex04controlstatement;

public class Qu_04_09 {
/*
	����4] �������� ���� for���� �̿��ؼ� ������ ���� ����Ͻÿ�
	���ϸ� : Qu_04_09.java
	���]				
		2*1=2   3*1=3 ~~~~~~~~~~  9*1=9
		2*2=4   ~~~~~~~~~~~~~~~ 9*2=18
		~~~~~~~~~~~~~
		2*8=16~~~~~~~~~~~~~~~~9*8=72
	2*9=18~~~~~~~~~~~~~~~~9*9=81
 */
	public static void main(String[] args) {
		
		
		for(int su = 1 ; su <= 9 ; su++) {
			for(int dan = 2; dan <= 9 ; dan++)
				System.out.printf("%d*%d=%d\t", dan, su, dan*su);
			System.out.println();
		}
	}
}
