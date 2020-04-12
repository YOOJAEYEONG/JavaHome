package ex18lambda;

import java.util.function.Consumer;

public class Ex06Define3Consumer {

	public static void main(String[] args) {
		
		
//		interface Consumer<T>{
//			void accept(T t);
//		}
		/*
		소비자. 즉 매개변수를 소비하는 형태라 생각하자.
		리턴값이 없으므로 단순한 출력결과만 보여준다.
		매개변수 O, 리턴값 X
		 */
		
		Consumer<Integer> c0 = (Integer i) -> {
			System.out.println(i+"년");
		};
		c0.accept(2020);//2020년
		
		
		Consumer<String> c1 = s -> {
			System.out.println(s + "는 가수입니다.");
		};
		c1.accept("아이유");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

























