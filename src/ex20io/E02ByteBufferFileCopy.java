package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class E02ByteBufferFileCopy {

	public static void main(String[] args) {

		try {
			InputStream inS = 
					new FileInputStream("src/ex20io/A38Http2.zip");
			OutputStream outS = 
					new FileOutputStream("src/ex20io/A38Http2_copy.zip");
			
			int copyByte = 0;
			int readLen;
			
			byte buffer[] = new byte[1024];
			
			while(true) {
				readLen = inS.read(buffer);
				if(readLen == -1) {
					break;
				}
				
				outS.write(buffer, 0, readLen);
				copyByte += readLen;
			}
		
			if(inS != null) inS.close();
			if(outS != null) outS.close();
			
			System.out.println("복사된파일크기 : "+ copyByte+"byte");
			System.out.println("복사된파일크기 : "+ copyByte/1024+"Kbyte");
			System.out.println("복사된 파일 크기 : " + copyByte/(1024*1024) + " Mbyte");

		
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
