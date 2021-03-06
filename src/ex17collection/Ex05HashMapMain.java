package ex17collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex05HashMapMain {

	public static void main(String[] args) {
		
		HashMap<String, String> map;
		map = new HashMap<String,String>();
		
		System.out.println("name이라는 키값으로 저장된 이전의 값:"
				+ map.put("name", "홍길동"));
		
		int number = 30;
		map.put("age", String.valueOf(number));
		map.put("gender", "남자");
		map.put("address", "가산디지털단지");
		map.put("gender", "자웅동체");
		
		System.out.println("저장된 객체수:" + map.size());
		
		System.out.println("name이라는 키값으로 저장된 이전의 값: "+
				map.put("name", "최길동"));
		System.out.println("키값으로 중복 저장후 객체수"+
				map.size());
		
		
		
		System.out.println("키값을 알때 : " + map.get("gender"));
		
		
		Set<String> keys = map.keySet();
		System.out.println(keys);

		for(String key : keys) {
			String value = map.get(key);
			System.out.println(String.format(key+ value));
		}
		
		System.out.println("[반복자 사용하기]");
		Set<String>	keys2 = map.keySet();
		Iterator<String> it = keys2.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(key + value);
		}
		
		System.out.println("[value값들만 출력하기]");
		Collection<String> values = map.values();
		System.out.println(values);
		for(String value : values) {
			System.out.println(value);
		}
		
		
		System.out.println(map.containsKey("name")?"name키 있다": " name키 없다");
		System.out.println(map.containsValue("여자")? "여자값 있다": "여자값없다");
		
		
		System.out.println("삭제된 객체: " + map.remove("age"));
		System.out.println("[age키값을 삭제후 출력]");
		for(String key : keys) {
			System.out.println(String.format(key, map.get(key)));
		}
		map.clear();
		System.out.println("전체 삭제후 객체수 : " + map.size());
		
		
	}
}


































