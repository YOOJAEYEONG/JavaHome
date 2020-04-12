package ex17collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import common.Teacher;

public class Ex04HashSet1 {

	public static void main(String[] args) {
		
		HashSet<Object> set = new HashSet<Object>();
		
		String strObject1 = "JAVA";
		String strObject2 = new String("KOSMO61기");
		Date dateObject = new Date();
		int number = 100;
		Teacher teacher = new Teacher("김봉두", 55, "체육");
		
		System.out.println(set.add(strObject1));
		
		set.add(strObject2);
		set.add(dateObject);
		set.add(number);
		set.add(teacher);
		
		System.out.println("[중복저장전 객체수]:"+set.size());//5
		
		System.out.println(set.add(strObject2)?"기본클래스는중복저장성공":"기본클래스는중복저장실패");//실패
		System.out.println("[중복(String)저장 후 객체수:"+ set.size());//5
		
		Teacher teacher2 = new Teacher("김봉두", 55, "체육");
		System.out.println(set.add(teacher2)?"직접정의한 클래스는 중복저장성공":"직접정의한 클래스는 중복저장실패");
		System.out.println("[중복(teacher2)저장 후 객체 수]: "+set.size());
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Object object = itr.next();
			if(object instanceof String) {
				System.out.println("String타입:"+object);
			}
			else if(object instanceof Date) {
				System.out.println("Date타입:"+object);
			}
			else if(object instanceof Integer) {
				System.out.println("Integer타입:"+object);
			}
			else if(object instanceof Teacher) {
				System.out.println("Teacher타입:"+object);
			}
			else {
				System.out.println("넌뭐임?");
			}
		}
		
		
		System.out.println(set.contains(strObject1)?"strObject1있다": "strObject1없다");
		System.out.println(set.contains("JAVA")?"JAVA있다":"JAVA없다");
		
		System.out.println(set.remove(strObject2)?"kosmo61기삭제됨": "kosmo61기삭제 실패");//kosmo61기 삭제됨
		System.out.println(set.remove("Android")? "Android삭제됨":"Android삭제 실패");
		
		System.out.println("전체 삭제 "+ set.removeAll(set));
		System.out.println("전체삭제후 객체수 출력:"+ set.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


































