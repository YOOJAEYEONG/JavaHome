package ex04controlstatement;

public class Qu_04_07 {

/*
����2] 1~100������ ������ 3�ǹ�� �̰ų� 7�ǹ���� ������ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
��, 3�� 7�� ������� ��� �տ��� �����ؾ� �Ѵ�. ����ǰ���� �����Ǵ� ��� ���� �ֿܼ� print�Ѵ�.
���ϸ� : Qu_04_07.java
 */
	public static void main(String[] args) {

		int sum = 0;
		for(int value = 1 ; value <= 100; value++)
			if(!(value%3==0 && value%7==0)) 
				if(value%3==0) {
					sum += value;
					System.out.print("+" + value);
				}
				else if (value%7==0) {
					sum += value;
					System.out.print("+" + value);
				}
		System.out.println("=" + sum);
	}
}
