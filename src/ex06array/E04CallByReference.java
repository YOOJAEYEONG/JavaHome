package ex06array;

/*
 * CallByReference (참조에 의한 호출)
 * 	: 메소드를 호출할때 참조값을 전달함으로써 서로 다른 지역에서도
 *  동일한 메모리(힙영역)를 참조할수 있게 하는 호출방법이다.
 *  메소드의 지역이 다르더라도 참조값을 통해 참조하므로
 *  A영역에서의 값의 변경을 B영역에서도 그대로 참조할수 있는 장점이 있다.
 *  참조값만 전달하므로 프로그램의 퍼포먼스(성능)도 향상되고,
 *  메모리도 절약할 수 있다.
 * 
 */
public class E04CallByReference {

	public static void main(String[] args) {

		int[] arr = {100, 200};
		System.out.println("[main method]-befor Swap)="+arr);
		for(int i = 0 ; i < arr.length ; i++) 
			System.out.println(arr[i]+" ");
		
		callByReference(arr);
		
		System.out.println("[main method]-after Swap)="+arr);
		for(int i = 0 ; i < arr.length ; i++) 
			System.out.println(arr[i]+" ");

	}
	
	static void callByReference(int[] ref) {
		int temp;
		temp = ref[0];
		ref[0]=ref[1];
		ref[1]=temp;
		
		System.out.println("[callByReference method]-after Swap)="+ref);
		for(int i = 0 ; i < ref.length ; i++)
			System.out.println(ref[i]+" ");
	}

}