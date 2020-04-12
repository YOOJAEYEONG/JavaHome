package ex18lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex06Define1Predicate {

	public static void main(String[] args) {
		
		Human p1 =  new Human("케이", "남", 80);
		Human p2 = new Human("에일리", "여", 77);
		
		Predicate<Human> pre = (Human human) -> {
			return human.getGender().equals("남");
		};
		System.out.println("pre.test(p1)=>"+ pre.test(p1));
		System.out.println("pre.test(p2)=>"+ pre.test(p2));
		System.out.println("================================");
		
		Human p3 = new Human("임재범", "남", 97);
		Human p4 = new Human("아이유", "여", 99);
		
		List<Human> list1 = Arrays.asList(p1,p2,p3,p4);
		
		double maleAvg = avg( (Human a) -> a.getGender().equals("남"), list1);
		System.out.println("남자 평균 : " + maleAvg);
		
		double femaleAvg = 
				avg((Human b) -> b.getGender().equals("여") , list1);
		System.out.println("여자 평균 : " + femaleAvg);
	
		
		
		
		
		
		List<Integer> list2 = Arrays.asList(1,3,5,7,9,11,12,14);
		int total;
		total = sum((Integer n) -> n%2 == 0, list2);
		System.out.println("짝수합 : " + total);
	
		total = sum(n -> n%2 != 0, list2);
	
	
	}
	
	public static double avg(Predicate<Human> human, List<Human> li) {
		int pCount = 0;
		int tCount = 0;
		for(Human h : li) {
			if(human.test(h)==true) {
				pCount++;
				tCount += h.getScore();
			}
		}
		return (double)tCount / pCount;
	}
	public static int sum(Predicate<Integer> isBoolean, List<Integer> li) {
		int sum = 0;
		for(int a : li) {
			if(isBoolean.test(a)) {
				sum += a;
			}
		}
		return sum;
	}
}
































