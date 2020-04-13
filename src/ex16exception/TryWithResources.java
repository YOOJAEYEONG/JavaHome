package ex16exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TryWithResources implements AutoCloseable{

	public static void main(String[] args) {

		String src = "C:/03WorkSpace/JavaHome/src/ex16exception/test.txt";
		try (
			FileOutputStream fileOut =  new FileOutputStream(src);
			FileInputStream fileIn = new FileInputStream(src);
			){
			
			fileOut.write(55);
			
			
			throw new Exception();
		} catch (Exception e) {
			System.out.println("강제로 예외처리 실행됨");
		}
	}

	@Override
	public void close() throws Exception {

		System.out.println("close()가 자동 호출실행됨");
	}

}
