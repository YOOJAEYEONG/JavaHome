package ex17collection;

import java.util.Iterator;
import java.util.LinkedList;


import common.Student;

public class Ex03ArrayList2 {

	public static void main(String[] args) {

		LinkedList<Student> list2 = new LinkedList<Student>();
		
		Student st1 = new Student("정우성", 10, "2018");
		Student st2 = new Student("원빈", 20, "2019");
		Student st3 = new Student("장동건", 30, "2020");
		Student st4 = new Student("공유", 40, "2021");
		
		list2.add(st1);
		list2.add(st2);
		list2.add(st3);
		list2.add(st4);
		list2.add(st2);
		
		
		System.out.println("중복저장후====================");
		for(Student st : list2) {
			st.showInfo();
		}
		
		list2.remove(st2);
		System.out.println("중복 저장된 객체 삭제후=============");
		for(Student st: list2) {
			st.showInfo();
		}
		
		System.out.println("반복자사용");
		
		Iterator<Student> it2 = list2.iterator();
		while(it2.hasNext()) {
			Student student = it2.next();
			student.showInfo();
		}
		
		System.out.println("일반for문 사용================");
		for(int i = 0; i<list2.size();i++) {
			list2.get(i).showInfo();
		}
		System.out.println("확장 for문을 사용============");
		for(Student st : list2) {
			st.showInfo();
		}
		
		System.out.println("삭제된 객체의 이름: "+ list2.remove(2).name);
		list2.remove(st1);//정우성을 삭제함
		
		System.out.println("인스턴스 삭제후============");
		for(Student st : list2) {
			st.showInfo();
		}
		
		
		
		
		
		
		
	}
}





























