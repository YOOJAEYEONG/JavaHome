package ex01start;

import java.util.HashSet;

class noName{
	int var;
	static int static_var;
}
public class test extends noName {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("34535");
		hashSet.add("34532");
		System.out.println(hashSet);
	}
}
