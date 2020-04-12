package ex20io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class E04FilterBufferFileCopy {

	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = 
					new FileInputStream("C:/01DevelopKits/win64_11gR2_database_1of2.zip"
							);
			FileOutputStream fileOutputStream =
					new FileOutputStream("C:/01DevelopKits/win64_11gR2_database_1of2_copy.zip"
							);
			
			BufferedInputStream bufferIn = 
					new BufferedInputStream(fileInputStream);
			BufferedOutputStream bufferOut =
					new BufferedOutputStream(fileOutputStream);
			
			int copyByte = 0;
			int bData;
			
			while(true) {
				bData = fileInputStream.read();
				if(bData == -1) { break; }
				fileOutputStream.write(bData);
				copyByte++;
			}
			
			System.out.println(copyByte/(1024*1024)+"Mbyte 복사됨");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
