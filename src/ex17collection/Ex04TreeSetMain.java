package ex17collection;

import java.util.Iterator;
import java.util.TreeSet;

class MyString implements Comparable<MyString>{
	
	String str;

	public MyString(String str) {
		super();
		this.str = str;
	}
	
	public int getLength() {
		return str.length();
	}
	
	@Override
	public int compareTo(MyString paramStr) {
		if(getLength() > paramStr.getLength()) {
			return 1;
		}
		else if(getLength() < paramStr.getLength()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return str;
	}
}

public class Ex04TreeSetMain {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree1 = new TreeSet<Integer>();
		tree1.add(1);
		tree1.add(4);
		tree1.add(2);
		tree1.add(3);
		System.out.println("저장된 데이터수: " + tree1.size());
		
		
		Iterator<Integer> itr1 = tree1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		/////////////////////////////////////
		TreeSet<MyString> tree2 = new TreeSet<MyString>();
		tree2.add(new MyString("Orange"));
		tree2.add(new MyString("Apple"));
		tree2.add(new MyString("Moon"));
		tree2.add(new MyString("KOSMO61"));
		
		Iterator<MyString> itr2 = tree2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}





























