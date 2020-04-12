package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03ArrayList1 {


	public static void main(String[] args) {
		
		
		/*
		ArrayList<String> list = 
				new ArrayList<String>();
		*/
		
		ArrayList list = new ArrayList();
		
		list.add("소녀시대");
		list.add("빅뱅");
		list.add("트와이스");
		list.add(3,"워너원");
		list.add(list.size(),"오마이걸");
		list.add(list.size(),"방탄");
		
		System.out.println("중복 저장전 객체 수 : "+list.size());
		
		System.out.println(list.add("트와이스")? "중복저장됨":"중복저장안됨");
		System.out.println(String.format("중복저장후 객체 수:"+list.size()));
		
		System.out.println("\n일반 for문 사용");
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("\n확장 for문사용");
		for(Object obj : list) {
			System.out.println(obj+" ");
		}
		///////////////////////////////////////////
		System.out.println("\n반복자===iterator사용");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {//반환할 객체가 있는지 검사
			System.out.println(itr.next());
		}
		System.out.println("========================");
		
		list.set(4, "오마이걸>덮어쓰기");
		for(Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("========================");

		list.add(4,"블랙핑크끼워넣기");
		for(Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("========================");
		
		System.out.println(list.contains("빅뱅")? "빅뱅있음":"빅뱅없음");
		System.out.println(list.contains("블랙핑크")? "블랙핑크있음":"블랙핑크없음");
		
		System.out.println("========================");
		
		Object obj = list.remove(2);
		System.out.println("삭제된 객체 : " + obj);
		System.out.println("트와이스의 인덱스에 채워진.."+list.get(2));
		System.out.println();
		int index = list.indexOf("빅뱅");
		System.out.println("빅뱅의 인덱스"+index);
		list.remove(index);
		
		System.out.println(list.remove("방탄")?
				"방탄삭제성공": "방탄삭제실패");
		list.remove("오마이걸");
		System.out.println("====삭제후 출력====");
		for(Object ob : list) {
			System.out.println(ob);
		}
		System.out.println("========전체삭제======");
		//list.removeAll(list);
		list.clear();
		System.out.println("전체 삭제후 객체수:"+list.size());
		
		
		
		
		
	}
	
	
	
	
}





































