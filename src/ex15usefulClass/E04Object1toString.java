package ex15usefulClass;


class myFriends extends Object{
	String myName;
	public myFriends(String name) {
		myName = name;
	}
	@Override
	public String toString() {
		return "이름: "+ myName;
	}
}
class yourFriends extends Object{
	String myName;
	public yourFriends(String name) {
		myName = name;
	}
}
public class E04Object1toString {

	public static void main(String[] args) {

		myFriends frd1 = new myFriends("백남기");
		yourFriends frd2 = new yourFriends("안철수");
		
		System.out.println(frd1);
		System.out.println(frd2);
	}
}
